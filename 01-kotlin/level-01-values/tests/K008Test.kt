package k008

import kotlin.test.*

class K008Test {
    @Test
    fun contract() {
        assertTrue(ready(20, false))
        assertFalse(ready(19, false))
        assertFalse(ready(90, true))
    }
}
