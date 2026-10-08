package k105

import kotlin.test.*

class K105Test {
    @Test
    fun contract() {
        assertEquals(listOf(3, 1, 2), rotate(listOf(1, 2, 3), 4))
        assertEquals(emptyList(), rotate(emptyList(), 5))
    }
}
