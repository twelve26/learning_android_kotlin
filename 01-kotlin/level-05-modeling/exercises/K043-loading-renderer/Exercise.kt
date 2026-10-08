package k043
sealed interface State {
    data object Idle : State

    data object Loading : State

    data class Data(val value: String) : State

    data class Failed(val reason: String) : State
}

fun render(state: State): String = TODO("K043: Loading renderer")
