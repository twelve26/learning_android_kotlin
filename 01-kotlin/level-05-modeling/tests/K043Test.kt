package k043

import kotlin.test.*

class K043Test {
    @Test
    fun contract() {
        assertEquals("Ready", render(State.Idle))
        assertEquals("Loading", render(State.Loading))
        assertEquals("ok", render(State.Data("ok")))
        assertEquals("Error: timeout", render(State.Failed("timeout")))
    }
}
