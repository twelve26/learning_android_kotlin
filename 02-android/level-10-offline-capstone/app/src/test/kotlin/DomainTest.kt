package lab.android

import org.junit.Assert.*
import org.junit.Test

class DomainTest {
    @Test
    fun contract() {
        assertEquals(
            Task("1", "remote", 2, false),
            mergeTask(Task("1", "local", 1, false), Task("1", "remote", 2, false)),
        )
        assertTrue(mergeTask(Task("1", "a", 2, false), Task("1", "", 2, true)).deleted)
    }
}
