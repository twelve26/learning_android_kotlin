package lab.shared

import io.ktor.client.*
import io.ktor.client.engine.mock.*
import io.ktor.http.*
import kotlin.test.*
import kotlinx.coroutines.test.runTest

class RepositoryTest {
    @Test
    fun requestContract() = runTest {
        val client =
            HttpClient(
                MockEngine { request ->
                    assertEquals("https://fixture.invalid/books", request.url.toString())
                    respond(
                        "[{\"id\":1,\"title\":\"Kotlin\"}]",
                        HttpStatusCode.OK,
                        headersOf(HttpHeaders.ContentType, "application/json"),
                    )
                }
            ) {
                expectSuccess = true
            }
        try {
            assertEquals(
                listOf(Book(1, "Kotlin")),
                BookRepository(client, "https://fixture.invalid/books").books(),
            )
        } finally {
            client.close()
        }
    }

    @Test
    fun statusFailure() = runTest {
        val client =
            HttpClient(MockEngine { respond("broken", HttpStatusCode.InternalServerError) }) {
                expectSuccess = true
            }
        try {
            assertFails { BookRepository(client, "https://fixture.invalid/books").books() }
        } finally {
            client.close()
        }
    }
}
