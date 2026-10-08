@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k096

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun searches(queries: Flow<String>, search: suspend (String) -> String): Flow<String> =
    queries.mapLatest { search(it) }
