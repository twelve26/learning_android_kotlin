package k062

import kotlin.test.*

class K062Test {
    @Test
    fun contract() {
        assertEquals(mapOf("a" to "2=3"), config(listOf("# x", "a=1", "a=2=3")))
        assertFailsWith<IllegalArgumentException> { config(listOf("bad")) }
    }
}
