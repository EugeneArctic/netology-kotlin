package homework05

import org.example.homework05.Post
import org.example.homework05.WallService
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class WallServiceTest {

    @BeforeEach
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun add_shouldAssignId() {
        val post = Post(text = "Hello!")
        val added = WallService.add(post)
        assertNotEquals(0, added.id)
    }

    @Test
    fun update_existingId_returnsTrue() {
        val added = WallService.add(Post(text = "Start"))
        val result = WallService.update(Post(id = added.id, text = "Updated"))
        assertTrue(result)
    }

    @Test
    fun update_nonExistingId_returnsFalse() {
        WallService.add(Post(text = "Start"))
        val result = WallService.update(Post(id = 999, text = "Nope"))
        assertFalse(result)
    }
}
