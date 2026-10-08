@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k095

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun recover(source: Flow<String>, cached: String): Flow<String> =
    source.catch { if (it is java.io.IOException) emit(cached) else throw it }
