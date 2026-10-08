package k033

import kotlin.test.*

class K033Test {
    @Test
    fun contract() {
        assertEquals(listOf(9, 9), top(listOf(3, 9, 9, 4), 2))
        assertEquals(emptyList(), top(listOf(1), 0))
    }
}
