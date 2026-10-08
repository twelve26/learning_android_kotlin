package lab.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.*
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MaterialTheme { Surface(Modifier.fillMaxSize()) { LabScreen() } } }
    }
}

@Composable
fun LabScreen() {
    var rows by remember { mutableStateOf(emptyList<String>()) }
    var message by remember { mutableStateOf("Ready") }
    var loading by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()
    var job by remember { mutableStateOf<Job?>(null) }
    fun load(mode: Int) {
        job?.cancel()
        job =
            scope.launch {
                loading = true
                message = "Loading"
                try {
                    val text =
                        withContext(Dispatchers.IO) {
                            delay(300)
                            when (mode) {
                                1 -> throw java.io.IOException("Simulated connection failure")
                                2 -> ""
                                3 -> {
                                    val c =
                                        java.net.URL("http://10.0.2.2:8765/books").openConnection()
                                            as java.net.HttpURLConnection
                                    try {
                                        c.connectTimeout = 3000
                                        c.readTimeout = 3000
                                        c.inputStream.bufferedReader().use { it.readText() }
                                    } finally {
                                        c.disconnect()
                                    }
                                }
                                else -> "Kotlin field notes\nAndroid lab\nShared code"
                            }
                        }
                    rows = parseTitles(text)
                    message = if (rows.isEmpty()) "No books yet" else "Loaded ${rows.size} books"
                } catch (e: java.io.IOException) {
                    message = "Could not load: ${e.message}"
                } finally {
                    loading = false
                }
            }
    }
    Column(
        Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Text("Network reader", style = MaterialTheme.typography.headlineMedium)
        Button(onClick = { load(0) }, enabled = !loading) { Text("Load fixture") }
        if (BuildConfig.CHECKPOINT >= 2)
            TextButton(onClick = { load(1) }, enabled = !loading) { Text("Simulate failure") }
        if (BuildConfig.CHECKPOINT >= 3)
            TextButton(onClick = { load(2) }, enabled = !loading) { Text("Load empty response") }
        if (BuildConfig.CHECKPOINT >= 4)
            TextButton(onClick = { load(3) }, enabled = !loading) { Text("Load local HTTP server") }
        Text(message, Modifier.semantics { liveRegion = LiveRegionMode.Polite })
        if (loading) CircularProgressIndicator()
        LazyColumn { items(rows) { Text(it, Modifier.padding(8.dp)) } }
    }
}
