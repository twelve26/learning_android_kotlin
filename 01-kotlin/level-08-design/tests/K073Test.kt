package k073

import kotlin.test.*

class K073Test {
    @Test
    fun contract() {
        var n = 0
        val s = settings {
            n++
            "ok"
        }
        assertEquals(0, n)
        assertEquals("ok", s.value)
        assertEquals("ok", s.value)
        assertEquals(1, n)
    }
}
