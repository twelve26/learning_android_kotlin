package k044

import kotlin.test.*

class K044Test {
    @Test
    fun contract() {
        assertEquals(12L, shipping(listOf(1, 2, 3), Pricing { it * 2L }))
        assertEquals(0L, shipping(emptyList(), Pricing { 9L }))
    }
}
