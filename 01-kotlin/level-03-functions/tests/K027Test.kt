package k027

import kotlin.test.*

class K027Test {
    @Test
    fun contract() {
        assertEquals(3, clamp(1, 3, 9))
        assertEquals(9, clamp(10, 3, 9))
        assertFailsWith<IllegalArgumentException> { clamp(0, 2, 1) }
    }
}
