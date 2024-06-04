package com.example.composefundamentals.ui.theme.util

data class Item(
    val id: Int,
    val title: String,
    val subtitle: String,
    val imageId: Int,
    val source: String = "demo source"
)


data class Tweet(
    val id: Int,
    val text: String,
    val author: String,
    val handle: String,
    val time: String,
    val authorImageId: Int,
    val likesCount: Int,
    val commentsCount: Int,
    val retweetCount: Int,
    val source: String,
    val tweetImageId: Int = 0
)
