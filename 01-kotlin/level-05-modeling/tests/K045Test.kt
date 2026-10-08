package k045

import kotlin.test.*

class K045Test {
    @Test
    fun contract() {
        assertEquals(Status.Doing, transition(Status.Todo, Status.Doing))
        assertEquals(Status.Todo, transition(Status.Todo, Status.Done))
        assertEquals(Status.Done, transition(Status.Done, Status.Doing))
    }
}
