@file:OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)

package lab.shared

import kotlin.test.*
import kotlinx.coroutines.*
import kotlinx.coroutines.test.*

class CounterTest {
    @Test
    fun cancellation() = runTest {
        Dispatchers.setMain(StandardTestDispatcher(testScheduler))
        try {
            val c = Counter()
            val seen = mutableListOf<Int>()
            val s = c.observe { seen.add(it) }
            runCurrent()
            c.increment()
            runCurrent()
            s.cancel()
            c.increment()
            runCurrent()
            assertEquals(listOf(0, 1), seen)
        } finally {
            Dispatchers.resetMain()
        }
    }
}
