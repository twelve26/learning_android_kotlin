@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k086

import kotlin.test.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*

class K086Test {
    @Test
    fun contract() {
        runTest {
            var n = 0
            val job = launch { serve { n++ } }
            runCurrent()
            job.cancelAndJoin()
            assertEquals(1, n)
        }
    }
}
