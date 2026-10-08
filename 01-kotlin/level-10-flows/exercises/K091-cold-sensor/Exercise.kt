@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k091

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun sensor(values: List<Int>): Flow<Int> = TODO("K091: Cold sensor")
