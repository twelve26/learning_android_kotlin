package lab.shared

import kotlin.test.*

class DomainTest {
    @Test
    fun contract() {
        assertEquals(setOf(1), toggle(emptySet(), 1))
        assertTrue(toggle(setOf(1), 1).isEmpty())
        assertEquals(setOf(1, 2), toggle(setOf(1), 2))
    }
}
