package k026

import kotlin.test.*

class K026Test {
    @Test
    fun contract() {
        assertEquals("gz", extension("backup.tar.GZ"))
        assertNull(extension(".env"))
        assertNull(extension("a."))
        assertNull(extension("README"))
    }
}
