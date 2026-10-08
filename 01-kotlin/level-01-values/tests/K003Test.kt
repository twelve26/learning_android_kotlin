package k003

import kotlin.test.*

class K003Test {
    @Test
    fun contract() {
        assertEquals(3, teams(14, 4))
        assertEquals(0, teams(0, 3))
    }
}
