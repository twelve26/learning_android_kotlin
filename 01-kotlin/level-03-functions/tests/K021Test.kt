package k021

import kotlin.test.*

class K021Test {
    @Test
    fun contract() {
        assertEquals("Guest", nickname(null))
        assertEquals("Guest", nickname("  "))
        assertEquals("Ada", nickname(" Ada "))
    }
}
