package lab.host

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import lab.shared.*

class MainActivity : ComponentActivity() {
    override fun onCreate(state: Bundle?) {
        super.onCreate(state)
        initializeStorage(applicationContext)
        setContent {
            MaterialTheme {
                val facade = remember { CourseFacade() }
                var message by remember { mutableStateOf("Ready") }
                Column(
                    Modifier.fillMaxSize().padding(24.dp),
                    verticalArrangement = Arrangement.spacedBy(20.dp),
                ) {
                    Text(
                        "Platform settings boundary",
                        style = MaterialTheme.typography.headlineMedium,
                    )
                    Text(message)
                    Button(onClick = { message = facade.act() }) { Text("Run shared rule") }
                }
            }
        }
    }
}
