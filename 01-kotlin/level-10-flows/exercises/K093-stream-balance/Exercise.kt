@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k093

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun balance(source: Flow<Int>): Flow<Long> = TODO("K093: Stream balance")
