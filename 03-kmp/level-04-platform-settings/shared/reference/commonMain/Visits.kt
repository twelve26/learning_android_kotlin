package lab.shared
class VisitCounter(private val store: StringStore) {
    fun next(): Int {
        val previous = store.read("visits")?.toIntOrNull()?.takeIf { it >= 0 } ?: 0
        val next = if (previous == Int.MAX_VALUE) 1 else previous + 1
        store.write("visits", next.toString())
        return next
    }
}
