package k046

import kotlin.test.*

class K046Test {
    @Test
    fun contract() {
        assertEquals(
            listOf(Contact(1, "new"), Contact(2, "B")),
            latest(listOf(Contact(1, "old"), Contact(2, "B"), Contact(1, "new"))),
        )
        assertEquals(emptyList(), latest(emptyList()))
    }
}
