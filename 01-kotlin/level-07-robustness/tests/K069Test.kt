package k069

import kotlin.test.*

class K069Test {
    @Test
    fun contract() {
        assertEquals(3L, withdraw(10, listOf(3, 4)))
        assertNull(withdraw(10, listOf(3, 8)))
        assertNull(withdraw(10, listOf(-1)))
    }
}
