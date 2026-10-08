@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k083

import kotlin.test.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*

class K083Test {
    @Test
    fun contract() {
        runTest {
            assertNull(
                bounded {
                    delay(101)
                    "late"
                }
            )
            assertEquals("ok", bounded { "ok" })
        }
    }
}
