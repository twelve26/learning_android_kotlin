package k079

import kotlin.test.*

class K079Test {
    @Test
    fun contract() {
        assertEquals(setOf("abc"), keys(listOf("ABC", "abc")))
        assertEquals(emptySet(), keys(emptyList()))
    }
}
