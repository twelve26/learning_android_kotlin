package lab.android
data class Task(val id: String, val title: String, val revision: Long, val deleted: Boolean)

fun mergeTask(local: Task, remote: Task): Task =
    if (remote.revision >= local.revision) remote else local
