@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k092

import kotlin.test.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*

class K092Test {
    @Test
    fun contract() {
        runTest { assertEquals(listOf(2, 4, 2), clean(flowOf(-1, 1, 1, 2, 1)).toList()) }
    }
}
