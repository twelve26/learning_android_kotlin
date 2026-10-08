@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k094

import kotlin.test.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*

class K094Test {
    @Test
    fun contract() {
        runTest {
            assertEquals("a", available(flowOf(null, "a", "b")))
            assertNull(available(flowOf(null)))
        }
    }
}
