package lab.android

import org.junit.Assert.*
import org.junit.Test

class DomainTest {
    @Test
    fun contract() {
        assertEquals(50, progressPercent(1, 2))
        assertEquals(0, progressPercent(2, 0))
        assertEquals(100, progressPercent(9, 2))
    }
}
