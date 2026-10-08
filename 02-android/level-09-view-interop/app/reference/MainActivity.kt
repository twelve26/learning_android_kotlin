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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MaterialTheme { Surface(Modifier.fillMaxSize()) { LabScreen() } } }
    }
}

@Composable
fun LabScreen() {
    var progress by rememberSaveable { mutableIntStateOf(25) }
    Column(Modifier.padding(24.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text("One compatibility boundary", style = MaterialTheme.typography.headlineMedium)
        AndroidView(
            factory = { context ->
                android.widget
                    .ProgressBar(context, null, android.R.attr.progressBarStyleHorizontal)
                    .apply { max = 100 }
            },
            update = {
                it.progress = boundedProgress(progress)
                it.contentDescription = "Legacy progress: $progress percent"
            },
            modifier = Modifier.fillMaxWidth(),
        )
        if (BuildConfig.CHECKPOINT >= 2)
            Slider(
                value = progress.toFloat(),
                onValueChange = { progress = boundedProgress(it.toInt()) },
                valueRange = 0f..100f,
            )
        if (BuildConfig.CHECKPOINT >= 3) Text("$progress percent")
        if (BuildConfig.CHECKPOINT >= 4)
            LinearProgressIndicator(
                progress = { progress / 100f },
                modifier = Modifier.fillMaxWidth(),
            )
    }
}
