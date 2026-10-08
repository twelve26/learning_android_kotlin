package lab.android

import org.junit.Assert.*
import org.junit.Test

class DomainTest {
    @Test
    fun contract() {
        assertEquals(0, nextCount(0, -1))
        assertEquals(20, nextCount(20, 1))
        assertEquals(4, nextCount(3, 1))
    }
}
