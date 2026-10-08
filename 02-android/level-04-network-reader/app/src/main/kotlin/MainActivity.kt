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

// Start here. This application runs before you solve the domain exercise.
@Composable
fun LabScreen() {
    var started by rememberSaveable { mutableStateOf(false) }
    Column(
        Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text("Network reader", style = MaterialTheme.typography.headlineMedium)
        Text("Open stages/01.md and turn this launchable canvas into the requested application.")
        Button(onClick = { started = true }) { Text("Begin workshop") }
        if (started)
            Text("Your first task: implement the domain contract, then replace this screen.")
    }
}

@Preview(showBackground = true)
@Composable
fun StarterPreview() {
    MaterialTheme { LabScreen() }
}
