package k039

import kotlin.test.*

class K039Test {
    @Test
    fun contract() {
        assertEquals(listOf(9, 8) to listOf(1, 2), partition(listOf(1, 9, 2, 8), 8))
        assertEquals(emptyList<Int>() to emptyList<Int>(), partition(emptyList(), 0))
    }
}
