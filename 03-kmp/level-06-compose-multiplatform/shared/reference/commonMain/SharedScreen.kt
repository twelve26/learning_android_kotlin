package lab.shared

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SharedScreen() {
    var selected by remember { mutableStateOf(emptySet<Int>()) }
    MaterialTheme {
        Column(
            Modifier.fillMaxSize()
                .statusBarsPadding()
                .verticalScroll(rememberScrollState())
                .padding(24.dp)
        ) {
            Text("Shared reading checklist", style = MaterialTheme.typography.h5)
            listOf("Kotlin", "Android", "KMP").forEachIndexed { id, title ->
                Row(Modifier.fillMaxWidth().padding(8.dp)) {
                    Checkbox(
                        checked = id in selected,
                        onCheckedChange = { selected = toggle(selected, id) },
                    )
                    Text(title, Modifier.padding(12.dp))
                }
            }
            Text("${selected.size} / 3 completed")
        }
    }
}
