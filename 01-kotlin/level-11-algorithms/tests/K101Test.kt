package k101

import kotlin.test.*

class K101Test {
    @Test
    fun contract() {
        assertEquals(0 to 1, twoSum(listOf(3, 3), 6))
        assertEquals(0 to 2, twoSum(listOf(2, 7, 9), 11))
        assertNull(twoSum(listOf(Int.MAX_VALUE, 1), Int.MIN_VALUE))
    }
}
