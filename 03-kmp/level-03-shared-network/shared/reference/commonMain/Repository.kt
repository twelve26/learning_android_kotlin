package lab.shared

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class BookRepository(private val client: HttpClient, private val endpoint: String) {
    suspend fun books(): List<Book> = parseBooks(client.get(endpoint).bodyAsText())
}

expect fun platformClient(): HttpClient
