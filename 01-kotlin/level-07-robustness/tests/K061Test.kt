package k061

import kotlin.test.*

class K061Test {
    @Test
    fun contract() {
        assertEquals(1 to -2, coordinates("1, -2"))
        assertNull(coordinates("1,2,3"))
        assertNull(coordinates("x,2"))
    }
}
