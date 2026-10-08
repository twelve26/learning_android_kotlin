@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k095

import kotlin.test.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*

class K095Test {
    @Test
    fun contract() {
        runTest {
            assertEquals(
                listOf("cached"),
                recover(flow { throw java.io.IOException() }, "cached").toList(),
            )
            assertFailsWith<IllegalStateException> { recover(flow { error("bug") }, "x").toList() }
        }
    }
}
