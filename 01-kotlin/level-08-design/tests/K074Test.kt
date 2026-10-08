package k074

import kotlin.test.*

class K074Test {
    @Test
    fun contract() {
        val log = mutableListOf<Pair<Int, Int>>()
        val s = score { a, b -> log.add(a to b) }
        s.value = 3
        s.value = 4
        assertEquals(listOf(0 to 3, 3 to 4), log)
    }
}
