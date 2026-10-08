package k038

import kotlin.test.*

class K038Test {
    @Test
    fun contract() {
        assertEquals(listOf(5L, 3L, 7L), balances(listOf(5, -2, 4)))
        assertEquals(emptyList(), balances(emptyList()))
    }
}
