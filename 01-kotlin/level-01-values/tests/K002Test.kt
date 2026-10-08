package k002

import kotlin.test.*

class K002Test {
    @Test
    fun contract() {
        assertEquals(3750L, total(3))
        assertEquals(2684354558750L, total(Int.MAX_VALUE))
    }
}
