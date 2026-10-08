package k106

import kotlin.test.*

class K106Test {
    @Test
    fun contract() {
        assertEquals(
            listOf(listOf("eat", "tea"), listOf("bat")),
            anagrams(listOf("eat", "bat", "tea")),
        )
        assertEquals(emptyList(), anagrams(emptyList()))
    }
}
