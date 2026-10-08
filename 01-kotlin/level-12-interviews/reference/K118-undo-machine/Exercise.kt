package k118

fun history(commands: List<String>): List<String> = run {
    val past = mutableListOf<String>()
    val future = mutableListOf<String>()
    for (c in commands) when {
        c.startsWith("+") -> {
            past.add(c.drop(1))
            future.clear()
        }
        c == "undo" -> {
            if (past.isNotEmpty()) future.add(past.removeAt(past.lastIndex))
        }
        c == "redo" -> {
            if (future.isNotEmpty()) past.add(future.removeAt(future.lastIndex))
        }
        else -> throw IllegalArgumentException(c)
    }
    past
}
