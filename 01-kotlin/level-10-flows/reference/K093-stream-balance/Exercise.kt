@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k093

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun balance(source: Flow<Int>): Flow<Long> = source.runningFold(0L) { a, v -> a + v }
