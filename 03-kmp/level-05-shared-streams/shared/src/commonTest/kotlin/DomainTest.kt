package lab.shared

import kotlin.test.*

class DomainTest {
    @Test
    fun contract() {
        assertEquals(1, nextValue(0))
        assertEquals(0, nextValue(Int.MAX_VALUE))
    }
}
