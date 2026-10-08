package k047

import kotlin.test.*

class K047Test {
    @Test
    fun contract() {
        assertEquals(12L, area(Rectangle(3, 4)))
        assertEquals(0L, area(Rectangle(0, 3)))
        assertFailsWith<IllegalArgumentException> { area(Rectangle(-1, 2)) }
    }
}
