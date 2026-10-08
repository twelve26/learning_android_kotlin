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
    var selected by rememberSaveable { mutableStateOf("Overview") }
    BoxWithConstraints(Modifier.fillMaxSize().padding(24.dp)) {
        val wide = BuildConfig.CHECKPOINT >= 2 && columns(maxWidth.value.toInt()) == 2
        val content: @Composable () -> Unit = {
            Column(
                Modifier.verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                Text("$selected dashboard", style = MaterialTheme.typography.headlineMedium)
                Text("Three habits completed today. Two remain.")
                if (BuildConfig.CHECKPOINT >= 3)
                    Text(
                        "60% complete",
                        Modifier.semantics {
                            contentDescription = "Daily habits: three of five complete"
                        },
                    )
                if (BuildConfig.CHECKPOINT >= 4)
                    OutlinedButton(
                        onClick = {
                            selected = if (selected == "Overview") "Weekly" else "Overview"
                        },
                        modifier = Modifier.heightIn(min = 48.dp),
                    ) {
                        Text("Switch report")
                    }
            }
        }
        if (wide)
            Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) {
                Column(Modifier.width(180.dp)) {
                    Text("Reports")
                    TextButton(onClick = { selected = "Overview" }) { Text("Overview") }
                    TextButton(onClick = { selected = "Weekly" }) { Text("Weekly") }
                }
                Box(Modifier.weight(1f)) { content() }
            }
        else content()
    }
}

@Preview(showBackground = true, widthDp = 360, fontScale = 2f)
@Composable
fun LargeText() {
    MaterialTheme { LabScreen() }
}

@Preview(showBackground = true, widthDp = 800)
@Composable
fun Tablet() {
    MaterialTheme { LabScreen() }
}
