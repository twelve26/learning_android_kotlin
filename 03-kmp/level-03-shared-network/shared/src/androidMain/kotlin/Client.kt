package lab.shared

import io.ktor.client.*
import io.ktor.client.engine.okhttp.*

actual fun platformClient() = HttpClient(OkHttp) { expectSuccess = true }
