package k023

import kotlin.test.*

class K023Test {
    @Test
    fun contract() {
        assertEquals(443, port(" 443 "))
        assertNull(port("0"))
        assertNull(port("65536"))
        assertNull(port("https"))
    }
}
