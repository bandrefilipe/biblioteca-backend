package io.bandrefilipe.biblioteca

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BibliotecaBackendApplication

fun main(args: Array<String>) {
    runCatching {
        runApplication<BibliotecaBackendApplication>(*args)
    }.onFailure { error ->
        error.printStackTrace(System.err)
    }
}
