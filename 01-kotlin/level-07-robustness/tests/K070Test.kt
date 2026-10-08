package k070

import kotlin.test.*

class K070Test {
    @Test
    fun contract() {
        var closed = false
        val r = java.io.Closeable { closed = true }
        assertFailsWith<IllegalStateException> { managed(r) { error("fail") } }
        assertTrue(closed)
    }
}
