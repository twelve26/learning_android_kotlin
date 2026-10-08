@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k088

import kotlin.test.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*

class K088Test {
    @Test
    fun contract() {
        runTest {
            assertEquals(
                7,
                resilient(
                    { throw java.io.IOException() },
                    {
                        delay(20)
                        7
                    },
                ),
            )
            assertFailsWith<CancellationException> {
                resilient({ throw CancellationException() }, { 2 })
            }
        }
    }
}
