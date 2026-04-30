package org.example.project

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
data class NewsResponse(
    val results: List<Article>
)

@Serializable
data class Article(
    val id: Int,
    val title: String,
    @SerialName("image_url") val imageUrl: String,
    val summary: String,
    @SerialName("published_at") val publishedAt: String,
    @SerialName("news_site") val newsSite: String,
    val url: String? = null
)
