@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k087

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.sync.withLock

suspend fun increments(n: Int): Int = coroutineScope {
    val mutex = kotlinx.coroutines.sync.Mutex()
    var count = 0
    List(n) {
            launch {
                mutex.withLock {
                    val old = count
                    yield()
                    count = old + 1
                }
            }
        }
        .joinAll()
    count
}
