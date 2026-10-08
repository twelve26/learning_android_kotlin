package k001

import kotlin.test.*

class K001Test {
    @Test
    fun contract() {
        assertEquals("Parcel #7: Tea", label(7, "Tea"))
        assertEquals("Parcel #0: ", label(0, ""))
    }
}
