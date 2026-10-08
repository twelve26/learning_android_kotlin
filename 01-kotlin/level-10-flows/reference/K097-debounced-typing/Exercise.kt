@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k097

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun typing(source: Flow<String>): Flow<String> = source.debounce(100)
