package k070

fun <T> managed(resource: java.io.Closeable, useBlock: (java.io.Closeable) -> T): T =
    TODO("K070: Resource lifetime")
