package org.example.project

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
// Removed Article and NewsRepository imports

sealed class NewsUiState {
    object Loading : NewsUiState()
    data class Success(val articles: List<Article>) : NewsUiState()
    data class Error(val message: String) : NewsUiState()
}

class NewsViewModel : ViewModel() {
    private val repository = NewsRepository()
    
    private val _uiState = MutableStateFlow<NewsUiState>(NewsUiState.Loading)
    val uiState: StateFlow<NewsUiState> = _uiState.asStateFlow()

    private val _isRefreshing = MutableStateFlow(false)
    val isRefreshing: StateFlow<Boolean> = _isRefreshing.asStateFlow()

    private val _isDarkMode = MutableStateFlow(false)
    val isDarkMode: StateFlow<Boolean> = _isDarkMode.asStateFlow()

    private val _favorites = MutableStateFlow<Set<Int>>(emptySet())
    val favorites: StateFlow<Set<Int>> = _favorites.asStateFlow()

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _profileName = MutableStateFlow("Zahwa Natasya Hamzah")
    val profileName: StateFlow<String> = _profileName.asStateFlow()

    private val _profileBio = MutableStateFlow("Mahasiswa Informatika ITERA")
    val profileBio: StateFlow<String> = _profileBio.asStateFlow()

    private var allArticles: List<Article> = emptyList()

    init {
        fetchNews()
    }

    fun updateProfile(name: String, bio: String) {
        _profileName.value = name
        _profileBio.value = bio
    }

    fun toggleDarkMode() {
        _isDarkMode.value = !_isDarkMode.value
    }

    fun toggleFavorite(articleId: Int) {
        val current = _favorites.value.toMutableSet()
        if (current.contains(articleId)) {
            current.remove(articleId)
        } else {
            current.add(articleId)
        }
        _favorites.value = current
    }

    fun onSearchQueryChange(query: String) {
        _searchQuery.value = query
        filterArticles()
    }

    private fun filterArticles() {
        val query = _searchQuery.value.lowercase()
        if (query.isEmpty()) {
            _uiState.value = NewsUiState.Success(allArticles)
        } else {
            val filtered = allArticles.filter { 
                it.title.lowercase().contains(query) || it.summary.lowercase().contains(query)
            }
            _uiState.value = NewsUiState.Success(filtered)
        }
    }

    fun fetchNews() {
        viewModelScope.launch {
            _uiState.value = NewsUiState.Loading
            try {
                val articles = repository.getNews()
                allArticles = articles
                filterArticles()
            } catch (e: Exception) {
                _uiState.value = NewsUiState.Error(e.message ?: "Unknown error occurred")
            }
        }
    }

    fun refresh() {
        viewModelScope.launch {
            _isRefreshing.value = true
            try {
                val articles = repository.getNews()
                allArticles = articles
                filterArticles()
            } catch (e: Exception) {
                _uiState.value = NewsUiState.Error(e.message ?: "Refresh failed")
            } finally {
                _isRefreshing.value = false
            }
        }
    }
}
