package lab.shared

import kotlin.test.*

class VisitsTest {
    private class MemoryStore : StringStore {
        val values = mutableMapOf<String, String>()

        override fun read(key: String) = values[key]

        override fun write(key: String, value: String) {
            values[key] = value
        }
    }

    @Test
    fun persistsAcrossOwners() {
        val s = MemoryStore()
        assertEquals(1, VisitCounter(s).next())
        assertEquals(2, VisitCounter(s).next())
    }

    @Test
    fun recoversCorruption() {
        val s = MemoryStore()
        s.write("visits", "broken")
        assertEquals(1, VisitCounter(s).next())
        s.write("visits", "-8")
        assertEquals(1, VisitCounter(s).next())
    }

    @Test
    fun boundsOverflow() {
        val s = MemoryStore()
        s.write("visits", Int.MAX_VALUE.toString())
        assertEquals(1, VisitCounter(s).next())
    }
}
