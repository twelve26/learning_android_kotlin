package k014

import kotlin.test.*

class K014Test {
    @Test
    fun contract() {
        assertEquals(0L, checksum(0))
        assertEquals(15L, checksum(5))
        assertEquals(500000500000L, checksum(1000000))
    }
}
