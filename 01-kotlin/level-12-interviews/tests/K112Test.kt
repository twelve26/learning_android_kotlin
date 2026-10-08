package k112

import kotlin.test.*

class K112Test {
    @Test
    fun contract() {
        assertEquals(listOf(true, true, false, true), admit(listOf(0, 1, 9, 10), 2, 10))
        assertEquals(listOf(false), admit(listOf(0), 0, 1))
    }
}
