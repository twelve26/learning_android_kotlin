package k025

import kotlin.test.*

class K025Test {
    @Test
    fun contract() {
        assertEquals(5L, cart(listOf(2, null, 3)))
        assertEquals(0L, cart(listOf(null)))
        assertEquals(0L, cart(emptyList()))
    }
}
