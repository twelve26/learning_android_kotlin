package k115

import kotlin.test.*

class K115Test {
    @Test
    fun contract() {
        assertEquals(listOf(5L, 9L), page(listOf(1L, 3L, 5L, 9L), 3, 2))
        assertEquals(emptyList(), page(listOf(1L), 1, 2))
    }
}
