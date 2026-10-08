package k111

import kotlin.test.*

class K111Test {
    @Test
    fun contract() {
        assertEquals(4, misses(listOf(1, 2, 1, 3, 2), 2))
        assertEquals(3, misses(listOf(1, 1, 1), 0))
    }
}
