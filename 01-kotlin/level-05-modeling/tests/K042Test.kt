package k042

import kotlin.test.*

class K042Test {
    @Test
    fun contract() {
        assertEquals(Money(10, "USD"), money(10, "USD"))
        assertFailsWith<IllegalArgumentException> { money(-1, "USD") }
        assertFailsWith<IllegalArgumentException> { money(1, "usd") }
    }
}
