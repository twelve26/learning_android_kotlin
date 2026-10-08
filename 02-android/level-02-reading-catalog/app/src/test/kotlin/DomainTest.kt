package lab.android

import org.junit.Assert.*
import org.junit.Test

class DomainTest {
    @Test
    fun contract() {
        assertEquals(1, matching(" kotlin ").size)
        assertEquals(3, matching("").size)
        assertTrue(matching("missing").isEmpty())
    }
}
