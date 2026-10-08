package k004

import kotlin.test.*

class K004Test {
    @Test
    fun contract() {
        assertEquals(2, remaining(14, 4))
        assertEquals(0, remaining(12, 4))
    }
}
