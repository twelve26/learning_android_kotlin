@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k089

import kotlin.test.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*

class K089Test {
    @Test
    fun contract() {
        runTest { assertEquals(7, dispatched(StandardTestDispatcher(testScheduler)) { 7 }) }
    }
}
