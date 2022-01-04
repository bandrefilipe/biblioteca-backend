package io.bandrefilipe.biblioteca.api

import io.bandrefilipe.biblioteca.domain.ObraEntity
import io.bandrefilipe.biblioteca.persistence.ObraRepository
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GetObrasRestController(
    private val obraRepository: ObraRepository,
) {

    @GetMapping(path = ["/obras/"])
    fun getObrasEndpoint(): ResponseEntity<List<ObraEntity>> {
        val obraList = obraRepository.listAll().also { obras ->
            log.info("Listing: ${obras.size} ObraEntity(ies)")
        }
        return if (obraList.isEmpty()) ResponseEntity.noContent().build()
        else ResponseEntity.ok(obraList)
    }

    companion object {
        private val log = LoggerFactory.getLogger(GetObrasRestController::class.java)
    }
}
