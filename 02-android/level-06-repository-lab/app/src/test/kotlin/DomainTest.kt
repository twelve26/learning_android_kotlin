package lab.android

import org.junit.Assert.*
import org.junit.Test

class DomainTest {
    @Test
    fun contract() {
        assertTrue(canReserve(3, 2))
        assertFalse(canReserve(3, 0))
        assertFalse(canReserve(3, 4))
    }
}
