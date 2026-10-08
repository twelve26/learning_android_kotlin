@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k098

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun valid(name: Flow<String>, accepted: Flow<Boolean>): Flow<Boolean> = TODO("K098: Combine form")
