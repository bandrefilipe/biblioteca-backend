package io.bandrefilipe.biblioteca.api

import io.bandrefilipe.biblioteca.domain.ObraVO
import io.bandrefilipe.biblioteca.persistence.ObraRepository
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PutObrasRestController(
    private val obraRepository: ObraRepository,
) {

    @PutMapping(path = ["/obras/{id}"])
    fun putObrasEndpoint(
        @PathVariable("id") id: Int,
        @RequestBody requestBody: ObraVO,
    ): ResponseEntity<Unit> {
        val updatedObra = obraRepository.update(id = id, values = requestBody).also { obra ->
            log.info("Updating: $obra")
        }
        return when (updatedObra) {
            null -> ResponseEntity.notFound().build()
            else -> ResponseEntity.ok().build()
        }
    }

    companion object {
        private val log = LoggerFactory.getLogger(PutObrasRestController::class.java)
    }
}
