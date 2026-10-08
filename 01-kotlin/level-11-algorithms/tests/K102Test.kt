package k102

import kotlin.test.*

class K102Test {
    @Test
    fun contract() {
        assertEquals(2, find(listOf(1, 3, 5, 7), 5))
        assertEquals(-1, find(emptyList(), 2))
        assertEquals(-1, find(listOf(1), 0))
    }
}
