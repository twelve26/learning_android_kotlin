package k032

import kotlin.test.*

class K032Test {
    @Test
    fun contract() {
        assertEquals(mapOf("tea" to 2, "cake" to 1), census("Tea cake tea"))
        assertEquals(emptyMap(), census(" "))
    }
}
