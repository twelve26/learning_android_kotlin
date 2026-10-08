package k040

import kotlin.test.*

class K040Test {
    @Test
    fun contract() {
        assertEquals(listOf("B", "A", "B"), join(listOf(2, 9, 1, 2), mapOf(1 to "A", 2 to "B")))
        assertEquals(emptyList(), join(emptyList(), emptyMap()))
    }
}
