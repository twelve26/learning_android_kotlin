package k048

import kotlin.test.*

class K048Test {
    @Test
    fun contract() {
        assertEquals(2L, replay(listOf(Command.Add(5), Command.Reset, Command.Add(2))))
        assertEquals(0L, replay(emptyList()))
    }
}
