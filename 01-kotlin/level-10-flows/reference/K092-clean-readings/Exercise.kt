@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k092

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun clean(source: Flow<Int>): Flow<Int> =
    source.filter { it >= 0 }.map { it * 2 }.distinctUntilChanged()
