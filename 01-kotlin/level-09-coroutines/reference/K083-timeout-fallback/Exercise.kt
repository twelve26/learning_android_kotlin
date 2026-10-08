@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k083

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

suspend fun bounded(block: suspend () -> String): String? = withTimeoutOrNull(100) { block() }
