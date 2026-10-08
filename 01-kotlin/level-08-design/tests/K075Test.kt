package k075

import kotlin.test.*

class K075Test {
    @Test
    fun contract() {
        assertEquals(mapOf("/" to "home"), routes { route("/", "home") })
        assertFailsWith<IllegalArgumentException> {
            routes {
                route("/", "a")
                route("/", "b")
            }
        }
    }
}
