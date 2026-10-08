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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.*
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MaterialTheme { Surface(Modifier.fillMaxSize()) { LabScreen() } } }
    }
}

class NotesDb(context: android.content.Context) :
    android.database.sqlite.SQLiteOpenHelper(context, "notes.db", null, 2) {
    override fun onCreate(db: android.database.sqlite.SQLiteDatabase) {
        db.execSQL(
            "CREATE TABLE notes(id INTEGER PRIMARY KEY AUTOINCREMENT, text TEXT NOT NULL, pinned INTEGER NOT NULL DEFAULT 0)"
        )
    }

    override fun onUpgrade(db: android.database.sqlite.SQLiteDatabase, old: Int, new: Int) {
        if (old < 2) db.execSQL("ALTER TABLE notes ADD COLUMN pinned INTEGER NOT NULL DEFAULT 0")
    }

    fun all(): List<Pair<Long, String>> =
        readableDatabase
            .rawQuery("SELECT id,text FROM notes ORDER BY pinned DESC,id DESC", null)
            .use { c -> buildList { while (c.moveToNext()) add(c.getLong(0) to c.getString(1)) } }

    fun add(text: String) {
        writableDatabase.insertOrThrow(
            "notes",
            null,
            android.content.ContentValues().apply { put("text", text) },
        )
    }

    fun remove(id: Long) {
        writableDatabase.delete("notes", "id=?", arrayOf(id.toString()))
    }

    fun pin(id: Long) {
        writableDatabase.execSQL("UPDATE notes SET pinned=1-pinned WHERE id=?", arrayOf(id))
    }
}

@Composable
fun LabScreen() {
    val context = LocalContext.current.applicationContext
    val db = remember { NotesDb(context) }
    val scope = rememberCoroutineScope()
    var text by rememberSaveable { mutableStateOf("") }
    var notes by remember { mutableStateOf(emptyList<Pair<Long, String>>()) }
    suspend fun refresh() {
        notes = withContext(Dispatchers.IO) { db.all() }
    }
    LaunchedEffect(Unit) { refresh() }
    DisposableEffect(db) { onDispose { db.close() } }
    Column(Modifier.fillMaxSize().padding(24.dp)) {
        Text("Persistent notes", style = MaterialTheme.typography.headlineMedium)
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Note (max 200 characters)") },
        )
        Button(
            onClick = {
                cleanNote(text)?.let { value ->
                    scope.launch {
                        withContext(Dispatchers.IO) { db.add(value) }
                        text = ""
                        refresh()
                    }
                }
            },
            enabled = cleanNote(text) != null,
        ) {
            Text("Add note")
        }
        LazyColumn {
            items(notes, key = { it.first }) { (id, value) ->
                Column {
                    Text(value, Modifier.padding(8.dp))
                    if (BuildConfig.CHECKPOINT >= 2)
                        TextButton(
                            onClick = {
                                scope.launch {
                                    withContext(Dispatchers.IO) { db.remove(id) }
                                    refresh()
                                }
                            }
                        ) {
                            Text("Delete $value")
                        }
                    if (BuildConfig.CHECKPOINT >= 3)
                        TextButton(
                            onClick = {
                                scope.launch {
                                    withContext(Dispatchers.IO) { db.pin(id) }
                                    refresh()
                                }
                            }
                        ) {
                            Text("Toggle pin for $value")
                        }
                }
            }
        }
        if (BuildConfig.CHECKPOINT >= 4)
            Text("Close and reopen: notes remain. Schema version 2 preserves old rows.")
    }
}
