package lab.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.*
import androidx.compose.ui.unit.dp
import androidx.work.*
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MaterialTheme { Surface(Modifier.fillMaxSize()) { LabScreen() } } }
    }
}

class ExportWorker(context: android.content.Context, params: WorkerParameters) :
    CoroutineWorker(context, params) {
    override suspend fun doWork(): Result {
        for (i in 1..5) {
            delay(500)
            setProgress(workDataOf("percent" to progressPercent(i, 5)))
        }
        applicationContext.openFileOutput("export.txt", 0).use {
            it.write("Local export complete".toByteArray())
        }
        return Result.success()
    }
}

@Composable
fun LabScreen() {
    val context = LocalContext.current
    val manager = remember { WorkManager.getInstance(context) }
    val work by
        manager
            .getWorkInfosForUniqueWorkFlow("learning-export")
            .collectAsState(initial = emptyList())
    val current = work.firstOrNull { !it.state.isFinished } ?: work.firstOrNull()
    Column(Modifier.padding(24.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("Background export", style = MaterialTheme.typography.headlineMedium)
        Button(
            onClick = {
                val request = OneTimeWorkRequestBuilder<ExportWorker>().build()
                manager.enqueueUniqueWork("learning-export", ExistingWorkPolicy.KEEP, request)
            }
        ) {
            Text("Schedule export")
        }
        Text(current?.state?.name ?: "No export scheduled")
        if (BuildConfig.CHECKPOINT >= 2)
            LinearProgressIndicator(
                progress = { (current?.progress?.getInt("percent", 0) ?: 0) / 100f },
                modifier = Modifier.fillMaxWidth(),
            )
        if (BuildConfig.CHECKPOINT >= 3)
            TextButton(onClick = { manager.cancelUniqueWork("learning-export") }) {
                Text("Cancel export")
            }
        if (BuildConfig.CHECKPOINT >= 4)
            Text(
                "Background the app and return. Inspect files/export.txt with Device Explorer after success."
            )
    }
}
