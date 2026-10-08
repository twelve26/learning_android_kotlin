package k053

import kotlin.test.*

class K053Test {
    @Test
    fun contract() {
        assertEquals("b", middle(listOf("a", "b", "c")))
        assertEquals(2, middle(listOf(1, 2)))
        assertNull(middle(emptyList<Int>()))
    }
}
