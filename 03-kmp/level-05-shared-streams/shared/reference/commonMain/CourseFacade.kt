package lab.shared
class CourseFacade {
    private val counter = Counter()

    fun act(): String = run {
        counter.increment()
        "Shared state: ${counter.state.value}"
    }
}
