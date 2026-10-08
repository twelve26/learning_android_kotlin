package lab.shared

import kotlin.test.*

class DomainTest {
    @Test
    fun contract() {
        assertEquals(listOf(Book(1, "Kotlin")), parseBooks("[{\"id\":1,\"title\":\"Kotlin\"}]"))
        assertTrue(parseBooks("[]").isEmpty())
        assertFails { parseBooks("invalid") }
    }
}
