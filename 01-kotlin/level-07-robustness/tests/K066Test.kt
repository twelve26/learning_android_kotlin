package k066

import kotlin.test.*

class K066Test {
    @Test
    fun contract() {
        assertTrue(balanced("a([{}])"))
        assertFalse(balanced("([)]"))
        assertFalse(balanced(")"))
        assertTrue(balanced(""))
    }
}
