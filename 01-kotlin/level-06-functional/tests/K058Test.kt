package k058

import kotlin.test.*

class K058Test {
    @Test
    fun contract() {
        var calls = 0
        val f = memoize {
            calls++
            it * it
        }
        assertEquals(9, f(3))
        assertEquals(9, f(3))
        assertEquals(4, f(2))
        assertEquals(2, calls)
    }
}
