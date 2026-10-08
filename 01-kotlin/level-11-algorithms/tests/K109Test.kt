package k109

import kotlin.test.*

class K109Test {
    @Test
    fun contract() {
        assertEquals(2, coins(listOf(1, 3, 4), 6))
        assertNull(coins(listOf(2), 3))
        assertEquals(0, coins(emptyList(), 0))
    }
}
