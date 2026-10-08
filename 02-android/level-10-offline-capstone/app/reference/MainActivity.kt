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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.*
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MaterialTheme { Surface(Modifier.fillMaxSize()) { LabScreen() } } }
    }
}

@Composable
fun LabScreen() {
    val context = LocalContext.current
    val prefs = remember { context.getSharedPreferences("board", 0) }
    var task by remember {
        mutableStateOf(
            Task(
                "1",
                prefs.getString("title", "Write a test") ?: "Write a test",
                prefs.getLong("revision", 0),
                prefs.getBoolean("deleted", false),
            )
        )
    }
    var draft by rememberSaveable { mutableStateOf(task.title) }
    var status by remember { mutableStateOf("Local data loaded") }
    fun persist(value: Task) {
        task = value
        prefs
            .edit()
            .putString("title", value.title)
            .putLong("revision", value.revision)
            .putBoolean("deleted", value.deleted)
            .apply()
    }
    Column(
        Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        Text("Offline task board", style = MaterialTheme.typography.headlineMedium)
        Text(if (task.deleted) "Task deleted (tombstone retained)" else task.title)
        OutlinedTextField(
            value = draft,
            onValueChange = { draft = it },
            label = { Text("Task title") },
        )
        Button(
            onClick = {
                persist(
                    task.copy(title = draft.trim(), revision = task.revision + 1, deleted = false)
                )
                status = "Saved locally"
            },
            enabled = draft.isNotBlank(),
        ) {
            Text("Save offline")
        }
        if (BuildConfig.CHECKPOINT >= 2)
            TextButton(
                onClick = { persist(task.copy(deleted = true, revision = task.revision + 1)) }
            ) {
                Text("Delete locally")
            }
        if (BuildConfig.CHECKPOINT >= 3)
            Button(
                onClick = {
                    val remote = Task("1", "Remote revision", task.revision + 1, false)
                    persist(mergeTask(task, remote))
                    status = "Merged deterministic remote fixture"
                }
            ) {
                Text("Simulate remote update")
            }
        if (BuildConfig.CHECKPOINT >= 4)
            Text("Revision ${task.revision}. Remote wins ties. $status")
    }
}
