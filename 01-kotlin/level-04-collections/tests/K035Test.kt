package k035

import kotlin.test.*

class K035Test {
    @Test
    fun contract() {
        assertEquals(listOf(listOf(1, 2), listOf(3)), pages(listOf(1, 2, 3), 2))
        assertEquals(emptyList(), pages(emptyList(), 2))
        assertFailsWith<IllegalArgumentException> { pages(listOf(1), 0) }
    }
}
