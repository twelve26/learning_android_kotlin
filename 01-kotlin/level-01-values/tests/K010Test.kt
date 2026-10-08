package k010

import kotlin.test.*

class K010Test {
    @Test
    fun contract() {
        assertEquals("AL", initials("Ada", "Lovelace"))
        assertEquals("ab", initials("a", "b"))
    }
}
