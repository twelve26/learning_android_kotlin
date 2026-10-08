package k037

import kotlin.test.*

class K037Test {
    @Test
    fun contract() {
        assertEquals(
            mapOf("k" to listOf("a", "b")),
            invert(linkedMapOf("a" to listOf("k", "k"), "b" to listOf("k"))),
        )
        assertEquals(emptyMap(), invert(emptyMap()))
    }
}
