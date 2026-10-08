package k031

import kotlin.test.*

class K031Test {
    @Test
    fun contract() {
        assertEquals(listOf("Ada", "Bob"), attendees(listOf(" Ada ", "", "Ada", "Bob")))
        assertEquals(emptyList(), attendees(emptyList()))
    }
}
