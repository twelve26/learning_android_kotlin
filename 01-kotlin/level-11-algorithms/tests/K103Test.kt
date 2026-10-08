package k103

import kotlin.test.*

class K103Test {
    @Test
    fun contract() {
        assertEquals(listOf(1 to 5, 8 to 9), mergeIntervals(listOf(3 to 5, 1 to 3, 8 to 9)))
        assertEquals(emptyList(), mergeIntervals(emptyList()))
    }
}
