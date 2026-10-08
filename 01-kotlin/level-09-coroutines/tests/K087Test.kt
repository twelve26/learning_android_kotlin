@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k087

import kotlin.test.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*

class K087Test {
    @Test
    fun contract() {
        runTest {
            assertEquals(100, increments(100))
            assertEquals(0, increments(0))
        }
    }
}
