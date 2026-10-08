package k012

import kotlin.test.*

class K012Test {
    @Test
    fun contract() {
        assertTrue(leap(2000))
        assertFalse(leap(1900))
        assertTrue(leap(2024))
        assertFalse(leap(2023))
    }
}
