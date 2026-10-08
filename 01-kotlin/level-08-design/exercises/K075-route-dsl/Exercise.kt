package k075
class RouteBuilder {
    internal val result = linkedMapOf<String, String>()

    fun route(path: String, page: String) {
        require(path.startsWith("/") && path !in result)
        result[path] = page
    }
}

fun routes(block: RouteBuilder.() -> Unit): Map<String, String> = TODO("K075: Route DSL")
