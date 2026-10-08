package k074
class Score(onChange: (Int, Int) -> Unit) {
    var value: Int by
        kotlin.properties.Delegates.observable(0) { _, old, new -> onChange(old, new) }
}

fun score(onChange: (Int, Int) -> Unit): Score = Score(onChange)
