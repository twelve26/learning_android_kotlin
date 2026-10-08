package lab.android

import org.junit.Assert.*
import org.junit.Test

class DomainTest {
    @Test
    fun contract() {
        assertEquals(0, boundedProgress(-1))
        assertEquals(100, boundedProgress(101))
        assertEquals(40, boundedProgress(40))
    }
}
