package k118

import kotlin.test.*

class K118Test {
    @Test
    fun contract() {
        assertEquals(listOf("a", "c"), history(listOf("+a", "+b", "undo", "+c", "redo")))
        assertEquals(listOf("a"), history(listOf("+a", "undo", "redo")))
    }
}
