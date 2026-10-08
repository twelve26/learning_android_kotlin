package k117

import kotlin.test.*

class K117Test {
    @Test
    fun contract() {
        assertEquals(
            mapOf("b" to "B"),
            active(mapOf("a" to Entry("A", 10), "b" to Entry("B", 11)), 10),
        )
    }
}
