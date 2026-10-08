package k022

import kotlin.test.*

class K022Test {
    @Test
    fun contract() {
        assertNull(divide(3, 0))
        assertEquals(1.5, divide(3, 2))
    }
}
