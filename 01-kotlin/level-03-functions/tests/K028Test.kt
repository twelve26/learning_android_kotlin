package k028

import kotlin.test.*

class K028Test {
    @Test
    fun contract() {
        assertEquals(1L, factorial(0))
        assertEquals(120L, factorial(5))
        assertEquals(2432902008176640000L, factorial(20))
        assertFailsWith<IllegalArgumentException> { factorial(21) }
    }
}
