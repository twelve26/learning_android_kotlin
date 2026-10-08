@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k096

import kotlin.test.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*

class K096Test {
    @Test
    fun contract() {
        runTest {
            val q = flow {
                emit("a")
                delay(10)
                emit("ab")
            }
            assertEquals(
                listOf("AB"),
                searches(q) {
                        delay(100)
                        it.uppercase()
                    }
                    .toList(),
            )
        }
    }
}
