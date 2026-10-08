package lab.android

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onRoot
import org.junit.Rule
import org.junit.Test

class LaunchTest {
    @get:Rule val rule = createAndroidComposeRule<MainActivity>()

    @Test
    fun screenLaunches() {
        rule.onRoot().assertExists()
    }
}
