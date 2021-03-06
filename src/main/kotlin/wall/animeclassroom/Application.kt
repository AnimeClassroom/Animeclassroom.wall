package wall.animeclassroom

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import wall.animeclassroom.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSerialization()
        configureTemplating()
        configureHTTP()
        configureSecurity()
    }.start(wait = true)
}
