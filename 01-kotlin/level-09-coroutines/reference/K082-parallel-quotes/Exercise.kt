@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k082

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

suspend fun quotes(a: suspend () -> Int, b: suspend () -> Int): Int = coroutineScope {
    val x = async { a() }
    val y = async { b() }
    x.await() + y.await()
}
