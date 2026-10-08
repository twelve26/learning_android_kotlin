package k067

import kotlin.test.*

class K067Test {
    @Test
    fun contract() {
        assertEquals(
            mapOf("Token" to "[REDACTED]", "id" to "7"),
            redact(mapOf("Token" to "secret", "id" to "7")),
        )
    }
}
