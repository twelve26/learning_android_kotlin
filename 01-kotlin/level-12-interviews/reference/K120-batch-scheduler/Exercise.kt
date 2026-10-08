package k120

fun batches(weights: List<Int>, limit: Int): List<List<Int>> = run {
    require(limit > 0 && weights.all { it in 1..limit })
    val out = mutableListOf<List<Int>>()
    var batch = mutableListOf<Int>()
    var sum = 0L
    for (w in weights) {
        if (sum + w > limit) {
            out.add(batch)
            batch = mutableListOf()
            sum = 0
        }
        batch.add(w)
        sum += w
    }
    if (batch.isNotEmpty()) out.add(batch)
    out
}
