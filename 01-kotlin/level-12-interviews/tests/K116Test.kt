package k116

import kotlin.test.*

class K116Test {
    @Test
    fun contract() {
        assertEquals(
            listOf(2, 1),
            search(
                mapOf(1 to "kotlin", 2 to "kotlin android", 3 to "swift"),
                "Android kotlin kotlin",
            ),
        )
        assertEquals(emptyList(), search(mapOf(1 to "a"), ""))
    }
}
