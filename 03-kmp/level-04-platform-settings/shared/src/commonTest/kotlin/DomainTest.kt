package lab.shared

import kotlin.test.*

class DomainTest {
    @Test
    fun contract() {
        assertEquals("Ada", normalizedName(" Ada "))
        assertEquals("Guest", normalizedName(" "))
        assertEquals(40, normalizedName("x".repeat(50)).length)
    }
}
