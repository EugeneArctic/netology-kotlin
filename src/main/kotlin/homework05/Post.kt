package org.example.homework05

data class Comments(
    val count: Int = 0,
    val canPost: Boolean = false
)

data class Likes(
    val count: Int = 0,
    val userLikes: Boolean = false,
    val canLike: Boolean = true
)

data class Post(
    val id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val text: String = "",
    val date: Int = 0,
    val friendsOnly: Boolean = false,
    val comments: Comments = Comments(),
    val likes: Likes = Likes(),
)
