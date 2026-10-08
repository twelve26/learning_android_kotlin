package k049

import kotlin.test.*

class K049Test {
    @Test
    fun contract() {
        assertEquals(
            listOf(Player("A", 2), Player("B", 2), Player("Z", 1)),
            rank(listOf(Player("Z", 1), Player("B", 2), Player("A", 2))),
        )
    }
}
