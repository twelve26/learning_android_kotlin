package lab.shared
data class HabitState(val count: Int, val goal: Int)

sealed interface HabitEvent {
    data object Complete : HabitEvent

    data object Undo : HabitEvent

    data object Reset : HabitEvent
}

fun reduce(state: HabitState, event: HabitEvent): HabitState =
    when (event) {
        HabitEvent.Complete -> state.copy(count = (state.count + 1).coerceAtMost(state.goal))
        HabitEvent.Undo -> state.copy(count = (state.count - 1).coerceAtLeast(0))
        HabitEvent.Reset -> state.copy(count = 0)
    }
