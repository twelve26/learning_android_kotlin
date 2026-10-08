package k104

import kotlin.test.*

class K104Test {
    @Test
    fun contract() {
        assertEquals(3, window("abcabcbb"))
        assertEquals(2, window("abba"))
        assertEquals(0, window(""))
    }
}
