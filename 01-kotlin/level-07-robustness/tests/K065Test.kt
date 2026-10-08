package k065

import kotlin.test.*

class K065Test {
    @Test
    fun contract() {
        assertEquals(0, compareVersions("1.2", "1.2.0"))
        assertEquals(-1, compareVersions("1.9", "1.10"))
        assertFailsWith<IllegalArgumentException> { compareVersions("1..2", "1") }
    }
}
