@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k097

import kotlin.test.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*

class K097Test {
    @Test
    fun contract() {
        runTest {
            val f = flow {
                emit("a")
                delay(20)
                emit("ab")
                delay(120)
                emit("abc")
            }
            assertEquals(listOf("ab", "abc"), typing(f).toList())
        }
    }
}
