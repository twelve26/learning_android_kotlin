@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k081

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

suspend fun greeting(): String = TODO("K081: Suspend greeting")
