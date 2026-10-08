@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k099

import kotlin.test.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*

class K099Test {
    @Test
    fun contract() {
        val s = MutableStateFlow(2)
        increment(s, 3)
        assertEquals(5, s.value)
    }
}
