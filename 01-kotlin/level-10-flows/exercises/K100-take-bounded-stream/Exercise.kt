@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k100

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

suspend fun first(n: Int): List<Int> = TODO("K100: Take bounded stream")
