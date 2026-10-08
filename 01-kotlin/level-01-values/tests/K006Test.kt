package k006

import kotlin.test.*

class K006Test {
    @Test
    fun contract() {
        assertEquals("1:05", clock(65))
        assertEquals("0:00", clock(0))
    }
}
