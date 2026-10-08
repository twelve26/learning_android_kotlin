package k076

import kotlin.test.*

class K076Test {
    @Test
    fun contract() {
        assertEquals(Vector(4, 6), combine(Vector(1, 2), Vector(3, 4)))
    }
}
