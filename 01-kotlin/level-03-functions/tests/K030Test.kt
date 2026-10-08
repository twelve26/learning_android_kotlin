package k030

import kotlin.test.*

class K030Test {
    @Test
    fun contract() {
        assertEquals(6L, sum(Node(1, listOf(Node(2), Node(3)))))
        assertEquals(-1L, sum(Node(-1)))
    }
}
