package lab.shared

import kotlin.test.*

class DomainTest {
    @Test
    fun contract() {
        assertEquals(225L, totalCents(listOf(100, 200), 25))
        assertEquals(0L, totalCents(emptyList(), 0))
        assertFailsWith<IllegalArgumentException> { totalCents(listOf(-1), 0) }
    }
}
