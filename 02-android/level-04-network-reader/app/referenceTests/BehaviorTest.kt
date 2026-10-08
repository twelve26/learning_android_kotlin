package lab.android
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import org.junit.Rule
import org.junit.Test
class BehaviorTest {
 @get:Rule val rule=createAndroidComposeRule<MainActivity>()
 @Test fun referenceAcceptance(){
rule.onNodeWithText("Load fixture").performClick()
rule.waitUntil(5000){rule.onAllNodesWithText("Loaded 3 books").fetchSemanticsNodes().isNotEmpty()}
rule.onNodeWithText("Kotlin field notes").assertExists()
rule.onNodeWithText("Simulate failure").performClick()
rule.waitUntil(5000){rule.onAllNodesWithText("Could not load: Simulated connection failure").fetchSemanticsNodes().isNotEmpty()}
rule.onNodeWithText("Load empty response").performClick()
rule.waitUntil(5000){rule.onAllNodesWithText("No books yet").fetchSemanticsNodes().isNotEmpty()}
}
}
