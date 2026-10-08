package k077

import kotlin.test.*

class K077Test {
    @Test
    fun contract() {
        assertEquals("Rex", animalName(Producer { Dog("Rex") }))
    }
}
