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
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.*
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MaterialTheme { Surface(Modifier.fillMaxSize()) { LabScreen() } } }
    }
}

@Composable
fun LabScreen() {
    val nav = rememberNavController()
    NavHost(navController = nav, startDestination = "catalog") {
        composable("catalog") {
            var query by rememberSaveable { mutableStateOf("") }
            Column(Modifier.fillMaxSize().padding(24.dp)) {
                Text("Reading catalog", style = MaterialTheme.typography.headlineMedium)
                if (BuildConfig.CHECKPOINT >= 2)
                    OutlinedTextField(
                        value = query,
                        onValueChange = { query = it },
                        label = { Text("Search books") },
                    )
                val books = matching(query)
                if (books.isEmpty()) Text("No matching books")
                LazyColumn {
                    items(books, key = { it }) { book ->
                        TextButton(
                            onClick = {
                                if (BuildConfig.CHECKPOINT >= 3)
                                    nav.navigate("detail/${android.net.Uri.encode(book)}")
                            }
                        ) {
                            Text(book)
                        }
                    }
                }
            }
        }
        composable("detail/{title}") { entry ->
            val title = entry.arguments?.getString("title").orEmpty()
            Column(Modifier.padding(24.dp)) {
                Text(title, style = MaterialTheme.typography.headlineMedium)
                Text("Read a chapter, write a summary, then apply one idea.")
                if (BuildConfig.CHECKPOINT >= 4) {
                    var saved by rememberSaveable { mutableStateOf(false) }
                    FilterChip(
                        selected = saved,
                        onClick = { saved = !saved },
                        label = { Text(if (saved) "Saved" else "Save for later") },
                    )
                }
                TextButton(onClick = { nav.popBackStack() }) { Text("Back to catalog") }
            }
        }
    }
}
