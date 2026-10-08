@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k085

import kotlin.test.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*

class K085Test {
    @Test
    fun contract() {
        runTest {
            assertEquals(
                listOf(2, 4, 6),
                parallel(listOf(1, 2, 3)) {
                    delay((4 - it) * 10L)
                    it * 2
                },
            )
            assertEquals(30L, currentTime)
        }
    }
}
