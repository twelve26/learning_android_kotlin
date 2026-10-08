package k108

import kotlin.test.*

class K108Test {
    @Test
    fun contract() {
        assertEquals(6L, maxSum(listOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
        assertEquals(-1L, maxSum(listOf(-3, -1)))
        assertNull(maxSum(emptyList()))
    }
}
