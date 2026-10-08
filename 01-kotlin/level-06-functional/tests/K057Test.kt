package k057

import kotlin.test.*

class K057Test {
    @Test
    fun contract() {
        assertEquals(
            "Hello Ada",
            message {
                append("Hello ")
                append("Ada")
            },
        )
        assertEquals("", message {})
    }
}
