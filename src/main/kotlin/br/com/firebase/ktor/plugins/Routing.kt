package br.com.firebase.ktor.plugins

import br.com.firebase.ktor.sendNotification
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        sendNotification()
    }
}
