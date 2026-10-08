package k060

fun <K, V> update(map: Map<K, V>, predicate: (K) -> Boolean, transform: (V) -> V): Map<K, V> =
    map.mapValues { (k, v) -> if (predicate(k)) transform(v) else v }
