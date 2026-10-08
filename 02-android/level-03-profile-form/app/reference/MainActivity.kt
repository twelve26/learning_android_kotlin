package lab.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.*
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.flow.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MaterialTheme { Surface(Modifier.fillMaxSize()) { LabScreen() } } }
    }
}

data class FormState(val name: String = "", val email: String = "", val message: String = "")

class ProfileModel : ViewModel() {
    private val mutable = MutableStateFlow(FormState())
    val state = mutable.asStateFlow()

    fun name(value: String) {
        mutable.update { it.copy(name = value, message = "") }
    }

    fun email(value: String) {
        mutable.update { it.copy(email = value, message = "") }
    }

    fun submit() {
        mutable.update {
            it.copy(
                message = validate(it.name, it.email) ?: "Profile saved locally for this session"
            )
        }
    }
}

@Composable
fun LabScreen() {
    val model: ProfileModel = viewModel()
    val state by model.state.collectAsStateWithLifecycle()
    Column(
        Modifier.fillMaxSize().verticalScroll(rememberScrollState()).imePadding().padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        Text("Profile workshop", style = MaterialTheme.typography.headlineMedium)
        OutlinedTextField(
            value = state.name,
            onValueChange = model::name,
            label = { Text("Name") },
            singleLine = true,
        )
        if (BuildConfig.CHECKPOINT >= 2)
            OutlinedTextField(
                value = state.email,
                onValueChange = model::email,
                label = { Text("Email") },
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            )
        Button(onClick = model::submit) { Text("Save profile") }
        if (BuildConfig.CHECKPOINT >= 3)
            Text(state.message, Modifier.semantics { liveRegion = LiveRegionMode.Polite })
        if (BuildConfig.CHECKPOINT >= 4)
            Text("Session state survives rotation; persistent storage comes next.")
    }
}
