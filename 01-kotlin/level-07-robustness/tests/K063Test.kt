package k063

import kotlin.test.*

class K063Test {
    @Test
    fun contract() {
        assertEquals(12, parse("12").getOrThrow())
        assertTrue(parse("x").isFailure)
    }
}
