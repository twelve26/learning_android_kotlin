package k060

import kotlin.test.*

class K060Test {
    @Test
    fun contract() {
        assertEquals(
            mapOf("a" to 2, "b" to 3),
            update(mapOf("a" to 1, "b" to 3), { it == "a" }, { it + 1 }),
        )
    }
}
