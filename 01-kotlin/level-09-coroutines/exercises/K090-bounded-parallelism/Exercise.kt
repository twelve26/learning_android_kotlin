@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k090

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

suspend fun limited(values: List<Int>, limit: Int, transform: suspend (Int) -> Int): List<Int> =
    TODO("K090: Bounded parallelism")
