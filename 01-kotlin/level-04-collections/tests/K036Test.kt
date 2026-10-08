package k036

import kotlin.test.*

class K036Test {
    @Test
    fun contract() {
        assertEquals(listOf(3L, -1L), changes(listOf(2, 5, 4)))
        assertEquals(emptyList(), changes(listOf(2)))
    }
}
