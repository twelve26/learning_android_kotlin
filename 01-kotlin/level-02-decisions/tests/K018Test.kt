package k018

import kotlin.test.*

class K018Test {
    @Test
    fun contract() {
        assertEquals(emptyList(), delays(0))
        assertEquals(listOf(1, 2, 4, 8), delays(4))
    }
}
