package k110

import kotlin.test.*

class K110Test {
    @Test
    fun contract() {
        assertEquals(
            listOf("a", "b", "c"),
            order(linkedMapOf("a" to listOf("b"), "b" to listOf("c"))),
        )
        assertNull(order(mapOf("a" to listOf("b"), "b" to listOf("a"))))
    }
}
