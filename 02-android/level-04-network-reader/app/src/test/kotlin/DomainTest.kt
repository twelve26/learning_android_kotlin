package lab.android

import org.junit.Assert.*
import org.junit.Test

class DomainTest {
    @Test
    fun contract() {
        assertEquals(listOf("A", "B"), parseTitles(" A\n\nB "))
        assertTrue(parseTitles("").isEmpty())
    }
}
