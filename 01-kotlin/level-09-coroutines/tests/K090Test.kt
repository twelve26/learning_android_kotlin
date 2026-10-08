@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k090

import kotlin.test.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*

class K090Test {
    @Test
    fun contract() {
        runTest {
            var active = 0
            var peak = 0
            assertEquals(
                listOf(1, 2, 3, 4),
                limited(listOf(1, 2, 3, 4), 2) {
                    active++
                    peak = maxOf(peak, active)
                    delay(10)
                    active--
                    it
                },
            )
            assertEquals(2, peak)
            assertEquals(20L, currentTime)
        }
    }
}
