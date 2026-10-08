package k107

import kotlin.test.*

class K107Test {
    @Test
    fun contract() {
        assertEquals(2, hops(mapOf("a" to listOf("b"), "b" to listOf("a", "c")), "a", "c"))
        assertEquals(0, hops(emptyMap(), "a", "a"))
        assertNull(hops(emptyMap(), "a", "b"))
    }
}
