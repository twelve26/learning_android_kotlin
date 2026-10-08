@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k090

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.sync.withPermit

suspend fun limited(values: List<Int>, limit: Int, transform: suspend (Int) -> Int): List<Int> =
    coroutineScope {
        require(limit > 0)
        val gate = kotlinx.coroutines.sync.Semaphore(limit)
        values.map { async { gate.withPermit { transform(it) } } }.awaitAll()
    }
