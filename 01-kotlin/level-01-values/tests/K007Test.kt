package k007

import kotlin.test.*

class K007Test {
    @Test
    fun contract() {
        assertEquals(9 to 4, swap(4, 9))
        assertEquals(0 to 0, swap(0, 0))
    }
}
