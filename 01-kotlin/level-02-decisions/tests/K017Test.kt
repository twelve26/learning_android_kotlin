package k017

import kotlin.test.*

class K017Test {
    @Test
    fun contract() {
        assertEquals("", stairs(0))
        assertEquals("*\n**\n***", stairs(3))
    }
}
