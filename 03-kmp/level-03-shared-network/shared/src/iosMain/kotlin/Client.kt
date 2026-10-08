package lab.shared

import io.ktor.client.*
import io.ktor.client.engine.darwin.*

actual fun platformClient() = HttpClient(Darwin) { expectSuccess = true }
