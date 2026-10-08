package k020

import kotlin.test.*

class K020Test {
    @Test
    fun contract() {
        assertEquals(0, longest(emptyList()))
        assertEquals(3, longest(listOf(true, true, false, true, true, true)))
        assertEquals(0, longest(listOf(false)))
    }
}
