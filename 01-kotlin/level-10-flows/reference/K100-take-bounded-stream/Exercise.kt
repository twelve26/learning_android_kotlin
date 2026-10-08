@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k100

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

suspend fun first(n: Int): List<Int> =
    if (n == 0) emptyList()
    else
        flow {
                var i = 0
                while (true) {
                    emit(i++)
                    yield()
                }
            }
            .take(n)
            .toList()
