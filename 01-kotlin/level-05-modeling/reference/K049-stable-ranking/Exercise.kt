package k049
data class Player(val name: String, val score: Int)

fun rank(players: List<Player>): List<Player> =
    players.sortedWith(compareByDescending<Player> { it.score }.thenBy { it.name })
