package k064

import kotlin.test.*

class K064Test {
    @Test
    fun contract() {
        assertEquals("" to "b", csv(",b"))
        assertEquals("a" to "", csv("a,"))
        assertFailsWith<IllegalArgumentException> { csv("a,b,c") }
    }
}
