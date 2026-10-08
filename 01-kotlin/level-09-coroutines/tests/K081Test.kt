@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k081

import kotlin.test.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*

class K081Test {
    @Test
    fun contract() {
        runTest {
            assertEquals("Hello", greeting())
            assertEquals(100L, currentTime)
        }
    }
}
