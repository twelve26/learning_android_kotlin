package k016

import kotlin.test.*

class K016Test {
    @Test
    fun contract() {
        assertFalse(prime(1))
        assertTrue(prime(2))
        assertFalse(prime(49))
        assertTrue(prime(97))
    }
}
