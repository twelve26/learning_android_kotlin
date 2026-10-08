package k050
data class Board(val cards: MutableList<String>)

fun add(board: Board, card: String): Board = Board((board.cards + card).toMutableList())
