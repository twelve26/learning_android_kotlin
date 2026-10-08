package k072

import kotlin.test.*

class K072Test {
    @Test
    fun contract() {
        val x = mutableListOf(1)
        val y = snapshot(x)
        x.add(2)
        assertEquals(listOf(1), y)
    }
}
