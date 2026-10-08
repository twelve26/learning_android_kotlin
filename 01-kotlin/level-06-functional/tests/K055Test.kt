package k055

import kotlin.test.*

class K055Test {
    @Test
    fun contract() {
        var calls = 0
        assertEquals(
            4,
            firstMapped(sequenceOf(1, 2, 3)) {
                calls++
                if (it == 2) it * 2 else null
            },
        )
        assertEquals(2, calls)
    }
}
