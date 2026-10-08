package k024

import kotlin.test.*

class K024Test {
    @Test
    fun contract() {
        assertEquals("Hello, Guest!", welcome())
        assertEquals("", welcome(times = 0))
        assertEquals("Hello, Ada! Hello, Ada!", welcome("Ada", 2))
    }
}
