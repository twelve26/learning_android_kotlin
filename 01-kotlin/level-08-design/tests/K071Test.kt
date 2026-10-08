package k071

import kotlin.test.*

class K071Test {
    @Test
    fun contract() {
        assertEquals(listOf(1, 2), select<Int>(listOf(1, "a", null, 2)))
        assertEquals(listOf("a"), select<String>(listOf(1, "a")))
    }
}
