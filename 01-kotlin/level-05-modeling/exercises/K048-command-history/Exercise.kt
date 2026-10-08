package k048
sealed interface Command {
    data class Add(val delta: Int) : Command

    data object Reset : Command
}

fun replay(commands: List<Command>): Long = TODO("K048: Command history")
