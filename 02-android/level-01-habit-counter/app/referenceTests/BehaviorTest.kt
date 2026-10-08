package lab.android
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import org.junit.Rule
import org.junit.Test
class BehaviorTest {
 @get:Rule val rule=createAndroidComposeRule<MainActivity>()
 @Test fun referenceAcceptance(){
rule.onNodeWithText("Add session").performClick()
rule.onNodeWithText("1 / 20 sessions").assertExists()
rule.activityRule.scenario.recreate()
rule.onNodeWithText("1 / 20 sessions").assertExists()
rule.onNodeWithText("Undo").performClick()
rule.onNodeWithText("0 / 20 sessions").assertExists()
rule.onNodeWithText("Undo").assertIsNotEnabled()
repeat(20){rule.onNodeWithText("Add session").performClick()}
rule.onNodeWithText("Add session").assertIsNotEnabled()
rule.onNodeWithText("Reset").performClick()
rule.onNodeWithText("0 / 20 sessions").assertExists()
}
}
