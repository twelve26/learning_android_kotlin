package lab.shared
class CourseFacade {
    private var state = HabitState(0, 5)

    fun act(): String = run {
        state = reduce(state, HabitEvent.Complete)
        "Habit: ${state.count}/${state.goal}"
    }
}
