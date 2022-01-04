package io.bandrefilipe.biblioteca.api

import io.bandrefilipe.biblioteca.persistence.ObraRepository
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class DeleteObrasRestController(
    private val obraRepository: ObraRepository,
) {

    @DeleteMapping(path = ["/obras/{id}"])
    fun deleteObrasEndpoint(@PathVariable("id") id: Int): ResponseEntity<Unit> {
        val removedObra = obraRepository.remove(id).also { obra ->
            log.info("Deleting: $obra")
        }
        return when (removedObra) {
            null -> ResponseEntity.notFound().build()
            else -> ResponseEntity.noContent().build()
        }
    }

    companion object {
        private val log = LoggerFactory.getLogger(DeleteObrasRestController::class.java)
    }
}
