@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k093

import kotlin.test.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*

class K093Test {
    @Test
    fun contract() {
        runTest {
            assertEquals(listOf(0L, 3L, 2L), balance(flowOf(3, -1)).toList())
            assertEquals(listOf(0L), balance(emptyFlow()).toList())
        }
    }
}
