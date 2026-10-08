@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k094

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

suspend fun available(source: Flow<String?>): String? = source.filterNotNull().firstOrNull()
