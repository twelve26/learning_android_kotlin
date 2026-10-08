package lab.host

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import lab.shared.Counter

class MainActivity : ComponentActivity() {
    override fun onCreate(state: Bundle?) {
        super.onCreate(state)
        setContent {
            MaterialTheme {
                val counter = remember { Counter() }
                val value by counter.state.collectAsStateWithLifecycle()
                Column(
                    Modifier.fillMaxSize().padding(24.dp),
                    verticalArrangement = Arrangement.spacedBy(20.dp),
                ) {
                    Text(
                        "Shared streams and lifecycle",
                        style = MaterialTheme.typography.headlineMedium,
                    )
                    Text("Shared state: $value")
                    Button(onClick = { counter.increment() }) { Text("Increment") }
                    Text(
                        "Leave and return: lifecycle-aware collection resumes. Rotation creates a new counter in this baseline; hoist it to a ViewModel as a lifetime exercise."
                    )
                }
            }
        }
    }
}
