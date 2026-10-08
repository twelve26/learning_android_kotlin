@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k084

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

suspend fun retry(attempts: Int, block: suspend () -> String): String = run {
    require(attempts > 0)
    var result: String? = null
    for (i in 1..attempts) {
        try {
            result = block()
            break
        } catch (e: java.io.IOException) {
            if (i == attempts) throw e
        }
    }
    result!!
}
