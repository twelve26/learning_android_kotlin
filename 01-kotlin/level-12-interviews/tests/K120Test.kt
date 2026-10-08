package k120

import kotlin.test.*

class K120Test {
    @Test
    fun contract() {
        assertEquals(listOf(listOf(2, 3), listOf(4, 1)), batches(listOf(2, 3, 4, 1), 5))
        assertEquals(emptyList(), batches(emptyList(), 5))
        assertFailsWith<IllegalArgumentException> { batches(listOf(6), 5) }
    }
}
