package k056

fun <A, B, C> compose(f: (A) -> B, g: (B) -> C): (A) -> C = { a -> g(f(a)) }
