package k114

import kotlin.test.*

class K114Test {
    @Test
    fun contract() {
        assertEquals(7L, ledger(listOf(Event("a", 5), Event("a", 9), Event("b", 2))))
        assertEquals(0L, ledger(emptyList()))
    }
}
