package lab.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.*
import androidx.compose.ui.unit.dp
import androidx.lifecycle.*
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MaterialTheme { Surface(Modifier.fillMaxSize()) { LabScreen() } } }
    }
}

interface StockRepository {
    suspend fun available(): Int

    suspend fun reserve(quantity: Int): Boolean
}

class MemoryStock : StockRepository {
    private var stock = 5

    override suspend fun available() = stock

    override suspend fun reserve(quantity: Int): Boolean {
        if (!canReserve(stock, quantity)) return false
        stock -= quantity
        return true
    }
}

class ReserveStock(private val repository: StockRepository) {
    suspend operator fun invoke(quantity: Int) = repository.reserve(quantity)
}

class StockModel(private val repository: StockRepository) : ViewModel() {
    private val mutable = MutableStateFlow("Ready")
    val state = mutable.asStateFlow()
    private val reserve = ReserveStock(repository)

    fun load() {
        viewModelScope.launch { mutable.value = "Stock: ${repository.available()}" }
    }

    fun buy() {
        viewModelScope.launch {
            mutable.value =
                if (reserve(1)) "Reserved. Stock: ${repository.available()}" else "Sold out"
        }
    }
}

@Composable
fun LabScreen() {
    val factory = remember {
        object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                @Suppress("UNCHECKED_CAST")
                return StockModel(MemoryStock()) as T
            }
        }
    }
    val model: StockModel = viewModel(factory = factory)
    val status by model.state.collectAsStateWithLifecycle()
    Column(Modifier.padding(24.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("Stock room", style = MaterialTheme.typography.headlineMedium)
        Text(status)
        Button(onClick = model::load) { Text("Check stock") }
        if (BuildConfig.CHECKPOINT >= 2) Button(onClick = model::buy) { Text("Reserve one") }
        if (BuildConfig.CHECKPOINT >= 3) Text("Repository -> use case -> ViewModel -> UI")
        if (BuildConfig.CHECKPOINT >= 4) Text("Try six reservations; the last must be rejected.")
    }
}
