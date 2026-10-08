package k034

import kotlin.test.*

class K034Test {
    @Test
    fun contract() {
        assertEquals(mapOf("a" to 5, "b" to 1), merge(mapOf("a" to 2), mapOf("a" to 3, "b" to 1)))
        assertEquals(emptyMap(), merge(emptyMap(), emptyMap()))
    }
}
