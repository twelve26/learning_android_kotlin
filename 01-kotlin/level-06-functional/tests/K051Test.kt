package k051

import kotlin.test.*

class K051Test {
    @Test
    fun contract() {
        assertEquals("hello-kotlin", " Hello, Kotlin! ".slug())
        assertEquals("", "!?".slug())
    }
}
