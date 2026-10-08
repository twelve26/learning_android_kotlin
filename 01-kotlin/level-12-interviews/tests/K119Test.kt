package k119

import kotlin.test.*

class K119Test {
    @Test
    fun contract() {
        assertEquals(
            listOf(Record(1, 2, true)),
            reconcile(listOf(Record(1, 1, false)), listOf(Record(1, 2, true))),
        )
        assertEquals(
            listOf(Record(1, 2, true)),
            reconcile(listOf(Record(1, 2, false)), listOf(Record(1, 2, true))),
        )
    }
}
