@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k098

import kotlin.test.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*

class K098Test {
    @Test
    fun contract() {
        runTest {
            assertEquals(listOf(true), valid(flowOf("Ada"), flowOf(true)).toList())
            assertEquals(listOf(false), valid(flowOf(" "), flowOf(true)).toList())
        }
    }
}
