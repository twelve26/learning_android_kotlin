package lab.android

import org.junit.Assert.*
import org.junit.Test

class DomainTest {
    @Test
    fun contract() {
        assertEquals("Name is required", validate("", "a@b.com"))
        assertNotNull(validate("Ada", "bad"))
        assertNull(validate("Ada", "a@b.com"))
    }
}
