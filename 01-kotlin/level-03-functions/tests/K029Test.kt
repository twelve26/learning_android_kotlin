package k029

import kotlin.test.*

class K029Test {
    @Test
    fun contract() {
        assertEquals("Ada", firstName(listOf(null, " ", " Ada ", "Bob")))
        assertNull(firstName(emptyList()))
    }
}
