package k059

import kotlin.test.*

class K059Test {
    @Test
    fun contract() {
        assertEquals(listOf("a1"), zipExact(listOf("a"), listOf(1)) { a, b -> "$a$b" })
        assertFailsWith<IllegalArgumentException> {
            zipExact(listOf(1), emptyList<Int>()) { a, b -> a + b }
        }
    }
}
