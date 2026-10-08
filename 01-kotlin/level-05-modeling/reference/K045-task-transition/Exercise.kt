package k045
enum class Status {
    Todo,
    Doing,
    Done,
}

fun transition(from: Status, to: Status): Status =
    if (from == Status.Todo && to == Status.Doing || from == Status.Doing && to == Status.Done) to
    else from
