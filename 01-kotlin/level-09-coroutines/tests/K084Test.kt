@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k084

import kotlin.test.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*

class K084Test {
    @Test
    fun contract() {
        runTest {
            var n = 0
            assertEquals(
                "ok",
                retry(3) {
                    n++
                    if (n < 3) throw java.io.IOException()
                    "ok"
                },
            )
            assertEquals(3, n)
            assertFailsWith<CancellationException> { retry(3) { throw CancellationException() } }
        }
    }
}
