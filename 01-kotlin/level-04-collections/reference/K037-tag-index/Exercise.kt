package k037

fun invert(docs: Map<String, List<String>>): Map<String, List<String>> =
    docs
        .flatMap { (doc, tags) -> tags.distinct().map { it to doc } }
        .groupBy({ it.first }, { it.second })
