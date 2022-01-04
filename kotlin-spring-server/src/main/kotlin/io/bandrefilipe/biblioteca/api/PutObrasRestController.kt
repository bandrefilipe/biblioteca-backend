package io.bandrefilipe.biblioteca.api

import io.bandrefilipe.biblioteca.domain.ObraVO
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PutObrasRestController {

    @PutMapping(path = ["/obras/{id}"])
    fun putObrasEndpoint(
        @PathVariable("id") id: Int,
        @RequestBody requestBody: ObraVO,
    ): ResponseEntity<Unit> {
        TODO("implementar PUT /obras/:id")
    }
}
