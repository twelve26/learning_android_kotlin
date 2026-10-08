package lab.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MaterialTheme { Surface(Modifier.fillMaxSize()) { LabScreen() } } }
    }
}

@Composable
fun LabScreen() {
    var count by rememberSaveable { mutableIntStateOf(0) }
    Column(
        Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text("Daily movement", style = MaterialTheme.typography.headlineMedium)
        Text("$count / 20 sessions", Modifier.semantics { liveRegion = LiveRegionMode.Polite })
        Button(onClick = { count = nextCount(count, 1) }, enabled = count < 20) {
            Text("Add session")
        }
        if (BuildConfig.CHECKPOINT >= 2)
            OutlinedButton(onClick = { count = nextCount(count, -1) }, enabled = count > 0) {
                Text("Undo")
            }
        if (BuildConfig.CHECKPOINT >= 3)
            LinearProgressIndicator(progress = { count / 20f }, modifier = Modifier.fillMaxWidth())
        if (BuildConfig.CHECKPOINT >= 4) TextButton(onClick = { count = 0 }) { Text("Reset") }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHabit() {
    MaterialTheme { LabScreen() }
}
