package k048
sealed interface Command {
    data class Add(val delta: Int) : Command

    data object Reset : Command
}

fun replay(commands: List<Command>): Long =
    commands.fold(0L) { value, c ->
        when (c) {
            is Command.Add -> value + c.delta
            Command.Reset -> 0L
        }
    }
