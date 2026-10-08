package k068

import kotlin.test.*

class K068Test {
    @Test
    fun contract() {
        assertEquals(Int.MIN_VALUE, bounded("-2147483648"))
        assertNull(bounded("2147483648"))
        assertNull(bounded("x"))
    }
}
