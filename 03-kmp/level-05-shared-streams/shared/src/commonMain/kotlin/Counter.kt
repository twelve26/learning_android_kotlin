package lab.shared

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

class Subscription(private val stop: () -> Unit) {
    fun cancel() = stop()
}

class Counter {
    private val mutable = MutableStateFlow(0)
    val state: StateFlow<Int> = mutable.asStateFlow()

    fun increment() {
        mutable.update(::nextValue)
    }

    fun observe(callback: (Int) -> Unit): Subscription {
        val scope = CoroutineScope(SupervisorJob() + Dispatchers.Main)
        val job = scope.launch { state.collect { callback(it) } }
        return Subscription {
            job.cancel()
            scope.cancel()
        }
    }
}
