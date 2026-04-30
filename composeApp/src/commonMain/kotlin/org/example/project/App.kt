package org.example.project

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.*
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun App() {
    val viewModel: NewsViewModel = viewModel { NewsViewModel() }
    val uiState by viewModel.uiState.collectAsState()
    val isRefreshing by viewModel.isRefreshing.collectAsState()
    val isDarkMode by viewModel.isDarkMode.collectAsState()
    val favorites by viewModel.favorites.collectAsState()
    val searchQuery by viewModel.searchQuery.collectAsState()
    val profileName by viewModel.profileName.collectAsState()
    val profileBio by viewModel.profileBio.collectAsState()
    
    val colorScheme = if (isDarkMode) darkColorScheme() else lightColorScheme()

    MaterialTheme(colorScheme = colorScheme) {
        var selectedArticle by remember { mutableStateOf<Article?>(null) }

        if (selectedArticle == null) {
            NewsMainScreen(
                uiState = uiState,
                isRefreshing = isRefreshing,
                onRefresh = { viewModel.refresh() },
                onArticleClick = { selectedArticle = it },
                searchQuery = searchQuery,
                onSearchQueryChange = { viewModel.onSearchQueryChange(it) },
                favorites = favorites,
                onToggleFavorite = { viewModel.toggleFavorite(it) },
                isDarkMode = isDarkMode,
                onToggleDarkMode = { viewModel.toggleDarkMode() },
                profileName = profileName,
                profileBio = profileBio,
                onUpdateProfile = { name, bio -> viewModel.updateProfile(name, bio) }
            )
        } else {
            NewsDetailScreen(
                article = selectedArticle!!,
                onBack = { selectedArticle = null }
            )
        }
    }
}
