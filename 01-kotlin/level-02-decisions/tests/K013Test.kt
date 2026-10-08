package k013

import kotlin.test.*

class K013Test {
    @Test
    fun contract() {
        assertEquals("FizzBuzz", fizz(15))
        assertEquals("Fizz", fizz(9))
        assertEquals("Buzz", fizz(10))
        assertEquals("7", fizz(7))
    }
}
