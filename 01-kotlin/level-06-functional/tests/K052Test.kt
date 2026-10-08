package k052

import kotlin.test.*

class K052Test {
    @Test
    fun contract() {
        assertEquals(8, pipeline(3, listOf({ it + 1 }, { it * 2 })))
        assertEquals(3, pipeline(3, emptyList()))
    }
}
