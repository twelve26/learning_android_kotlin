package k019

import kotlin.test.*

class K019Test {
    @Test
    fun contract() {
        assertEquals(1, alarm(listOf(3, 6, 9), 5))
        assertEquals(-1, alarm(emptyList(), 0))
        assertEquals(-1, alarm(listOf(5), 5))
    }
}
