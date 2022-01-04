package io.bandrefilipe.biblioteca.api

import io.bandrefilipe.biblioteca.domain.ObraVO
import io.bandrefilipe.biblioteca.persistence.ObraRepository
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PostObrasRestController(
    private val obraRepository: ObraRepository,
) {

    @PostMapping(path = ["/obras"])
    fun postObrasEndpoint(@RequestBody requestBody: ObraVO): ResponseEntity<Unit> {
        obraRepository.insert(obra = requestBody).also { obra ->
            log.info("Posted: $obra")
        }
        return ResponseEntity.ok().build()
    }

    companion object {
        private val log = LoggerFactory.getLogger(PostObrasRestController::class.java)
    }
}
