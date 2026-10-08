package lab.android

import org.junit.Assert.*
import org.junit.Test

class DomainTest {
    @Test
    fun contract() {
        assertEquals(1, columns(599))
        assertEquals(2, columns(600))
    }
}
