package lab.shared
data class HabitState(val count: Int, val goal: Int)

sealed interface HabitEvent {
    data object Complete : HabitEvent

    data object Undo : HabitEvent

    data object Reset : HabitEvent
}

fun reduce(state: HabitState, event: HabitEvent): HabitState =
    TODO("Complete the common domain contract")
