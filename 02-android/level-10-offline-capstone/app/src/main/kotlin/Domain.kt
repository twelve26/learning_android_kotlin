package lab.android
data class Task(val id: String, val title: String, val revision: Long, val deleted: Boolean)

fun mergeTask(local: Task, remote: Task): Task =
    TODO("Implement the domain contract described in stages")
