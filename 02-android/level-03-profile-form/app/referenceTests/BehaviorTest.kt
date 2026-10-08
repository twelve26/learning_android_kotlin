package lab.android
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import org.junit.Rule
import org.junit.Test
class BehaviorTest {
 @get:Rule val rule=createAndroidComposeRule<MainActivity>()
 @Test fun referenceAcceptance(){
rule.onNodeWithText("Save profile").performClick()
rule.onNodeWithText("Name is required").assertExists()
rule.onAllNodes(hasSetTextAction())[0].performTextInput("Ada")
rule.onAllNodes(hasSetTextAction())[1].performTextInput("bad")
rule.onNodeWithText("Save profile").performClick()
rule.onNodeWithText("Enter a valid email").assertExists()
rule.onAllNodes(hasSetTextAction())[1].performTextReplacement("ada@example.com")
rule.onNodeWithText("Save profile").performClick()
rule.onNodeWithText("Profile saved locally for this session").assertExists()
}
}
