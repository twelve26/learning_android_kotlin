package k078

import kotlin.test.*

class K078Test {
    @Test
    fun contract() {
        val names = mutableListOf<String>()
        val c = Consumer<Animal> { names.add(it.name) }
        send(listOf(Dog("Rex")), c)
        assertEquals(listOf("Rex"), names)
    }
}
