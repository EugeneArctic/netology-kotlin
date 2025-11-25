package org.example.homework05

object WallService {

    private var posts = emptyArray<Post>()
    private var lastId = 0

    fun clear() {
        posts = emptyArray()
        lastId = 0
    }

    fun add(post: Post): Post {
        lastId++
        val newPost = post.copy(id = lastId)
        posts += newPost
        return newPost
    }

    fun update(post: Post): Boolean {
        for ((index, oldPost) in posts.withIndex()) {
            if (oldPost.id == post.id) {
                posts[index] = post.copy(id = oldPost.id)
                return true
            }
        }
        return false
    }
}
