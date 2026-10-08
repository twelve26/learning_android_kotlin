package lab.android
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import org.junit.Rule
import org.junit.Test
class BehaviorTest {
 @get:Rule val rule=createAndroidComposeRule<MainActivity>()
 @Test fun referenceAcceptance(){
rule.onNodeWithText("Search books").performTextInput("KOTLIN")
rule.onNodeWithText("Kotlin in Action").performClick()
rule.onNodeWithText("Save for later").performClick()
rule.onNodeWithText("Saved").assertExists()
rule.activityRule.scenario.recreate()
rule.onNodeWithText("Saved").assertExists()
rule.onNodeWithText("Back to catalog").performClick()
rule.onNodeWithText("Android Internals").assertDoesNotExist()
rule.onNodeWithText("Search books").performTextReplacement("missing")
rule.onNodeWithText("No matching books").assertExists()
}
}
