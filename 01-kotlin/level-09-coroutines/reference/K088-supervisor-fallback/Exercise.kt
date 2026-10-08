@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k088

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

suspend fun resilient(a: suspend () -> Int, b: suspend () -> Int): Int = supervisorScope {
    suspend fun safe(f: suspend () -> Int) =
        try {
            f()
        } catch (e: java.io.IOException) {
            0
        }
    val x = async { safe(a) }
    val y = async { safe(b) }
    x.await() + y.await()
}
