package k030
data class Node(val value: Int, val children: List<Node> = emptyList())

fun sum(node: Node): Long = node.value.toLong() + node.children.sumOf(::sum)
