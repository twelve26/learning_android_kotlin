@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k088

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

suspend fun resilient(a: suspend () -> Int, b: suspend () -> Int): Int =
    TODO("K088: Supervisor fallback")
