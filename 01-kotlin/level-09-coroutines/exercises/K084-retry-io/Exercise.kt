@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k084

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

suspend fun retry(attempts: Int, block: suspend () -> String): String = TODO("K084: Retry IO")
