package k050

import kotlin.test.*

class K050Test {
    @Test
    fun contract() {
        val b = Board(mutableListOf("a"))
        val c = add(b, "b")
        c.cards.add("c")
        assertEquals(listOf("a"), b.cards)
        assertEquals(listOf("a", "b", "c"), c.cards)
    }
}
