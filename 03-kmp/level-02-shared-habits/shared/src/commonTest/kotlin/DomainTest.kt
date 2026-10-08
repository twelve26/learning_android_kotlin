package lab.shared

import kotlin.test.*

class DomainTest {
    @Test
    fun contract() {
        assertEquals(HabitState(1, 3), reduce(HabitState(0, 3), HabitEvent.Complete))
        assertEquals(HabitState(0, 3), reduce(HabitState(0, 3), HabitEvent.Undo))
        assertEquals(HabitState(3, 3), reduce(HabitState(3, 3), HabitEvent.Complete))
    }
}
