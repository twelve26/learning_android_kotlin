package k011

import kotlin.test.*

class K011Test {
    @Test
    fun contract() {
        assertEquals("invalid", category(-1))
        assertEquals("child", category(11))
        assertEquals("teen", category(12))
        assertEquals("adult", category(18))
    }
}
