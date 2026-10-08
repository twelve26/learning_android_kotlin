package k041

import kotlin.test.*

class K041Test {
    @Test
    fun contract() {
        val u = User("Ada", false)
        assertEquals(User("Ada", true), promote(u))
        assertFalse(u.premium)
    }
}
