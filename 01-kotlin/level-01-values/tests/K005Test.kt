package k005

import kotlin.test.*

class K005Test {
    @Test
    fun contract() {
        assertEquals(32.0, fahrenheit(0.0))
        assertEquals(-40.0, fahrenheit(-40.0))
    }
}
