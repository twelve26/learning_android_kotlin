package k015

import kotlin.test.*

class K015Test {
    @Test
    fun contract() {
        assertEquals(1, digits(0))
        assertEquals(3, digits(-120))
        assertEquals(10, digits(Int.MIN_VALUE))
    }
}
