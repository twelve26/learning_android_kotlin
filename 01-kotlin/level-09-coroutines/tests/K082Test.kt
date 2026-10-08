@file:OptIn(
    kotlinx.coroutines.ExperimentalCoroutinesApi::class,
    kotlinx.coroutines.FlowPreview::class,
)

package k082

import kotlin.test.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*

class K082Test {
    @Test
    fun contract() {
        runTest {
            assertEquals(
                5,
                quotes(
                    {
                        delay(100)
                        2
                    },
                    {
                        delay(200)
                        3
                    },
                ),
            )
            assertEquals(200L, currentTime)
        }
    }
}
