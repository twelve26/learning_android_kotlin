package k043
sealed interface State {
    data object Idle : State

    data object Loading : State

    data class Data(val value: String) : State

    data class Failed(val reason: String) : State
}

fun render(state: State): String =
    when (state) {
        State.Idle -> "Ready"
        State.Loading -> "Loading"
        is State.Data -> state.value
        is State.Failed -> "Error: ${state.reason}"
    }
