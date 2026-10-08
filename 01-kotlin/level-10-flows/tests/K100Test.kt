@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k100

import kotlin.test.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*

class K100Test {
    @Test
    fun contract() {
        runTest {
            assertEquals(listOf(0, 1, 2), first(3))
            assertEquals(emptyList(), first(0))
        }
    }
}
