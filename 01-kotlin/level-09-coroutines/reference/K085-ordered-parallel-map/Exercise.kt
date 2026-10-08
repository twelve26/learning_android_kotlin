@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k085

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

suspend fun parallel(values: List<Int>, transform: suspend (Int) -> Int): List<Int> =
    coroutineScope {
        values.map { async { transform(it) } }.awaitAll()
    }
