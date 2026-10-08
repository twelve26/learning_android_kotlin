package k054

import kotlin.test.*

class K054Test {
    @Test
    fun contract() {
        assertTrue(accepts("abc", listOf({ it.length >= 3 })))
        assertFalse(accepts("a", listOf({ it.length >= 3 })))
        assertTrue(accepts("", emptyList()))
    }
}
