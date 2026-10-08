@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k099

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun increment(state: MutableStateFlow<Int>, delta: Int): Unit = state.update { it + delta }
