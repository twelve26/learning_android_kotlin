package k009

import kotlin.test.*

class K009Test {
    @Test
    fun contract() {
        assertEquals(4294967295L, distance(Int.MIN_VALUE, Int.MAX_VALUE))
        assertEquals(0L, distance(3, 3))
    }
}
