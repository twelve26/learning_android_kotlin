package k080

import kotlin.test.*

class K080Test {
    @Test
    fun contract() {
        assertNull(fromJava(java.util.Optional.empty()))
        assertNull(fromJava(java.util.Optional.of(" ")))
        assertEquals("Ada", fromJava(java.util.Optional.of(" Ada ")))
    }
}
