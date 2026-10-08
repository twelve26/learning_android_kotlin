@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k091

import kotlin.test.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*

class K091Test {
    @Test
    fun contract() {
        runTest {
            val f = sensor(listOf(1, 2))
            assertEquals(listOf(1, 2), f.toList())
            assertEquals(listOf(1, 2), f.toList())
        }
    }
}
