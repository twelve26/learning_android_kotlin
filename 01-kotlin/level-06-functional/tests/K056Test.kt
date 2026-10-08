package k056

import kotlin.test.*

class K056Test {
    @Test
    fun contract() {
        assertEquals("6", compose<Int, Int, String>({ it * 2 }, { it.toString() })(3))
    }
}
