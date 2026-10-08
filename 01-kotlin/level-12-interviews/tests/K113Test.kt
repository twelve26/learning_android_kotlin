package k113

import kotlin.test.*

class K113Test {
    @Test
    fun contract() {
        assertEquals(Document("new", 3), save(Document("old", 2), 2, "new"))
        assertNull(save(Document("old", 2), 1, "new"))
    }
}
