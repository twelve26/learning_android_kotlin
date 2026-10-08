@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k086

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

suspend fun serve(cleanup: () -> Unit): Unit =
    try {
        awaitCancellation()
    } finally {
        cleanup()
    }
