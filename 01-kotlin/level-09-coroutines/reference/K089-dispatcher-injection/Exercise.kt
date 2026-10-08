@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k089

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

suspend fun dispatched(dispatcher: CoroutineDispatcher, block: () -> Int): Int =
    withContext(dispatcher) { block() }
