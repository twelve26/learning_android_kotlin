package lab.android

import org.junit.Assert.*
import org.junit.Test

class DomainTest {
    @Test
    fun contract() {
        assertEquals("Hi", cleanNote(" Hi "))
        assertNull(cleanNote(" "))
        assertNull(cleanNote("x".repeat(201)))
    }
}
