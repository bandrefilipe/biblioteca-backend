package io.bandrefilipe.biblioteca.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class DeleteObrasRestController {

    @DeleteMapping(path = ["/obras/{id}"])
    fun deleteObrasEndpoint(@PathVariable("id") id: Int): ResponseEntity<Unit> {
        TODO("implementar DELETE /obras/:id")
    }
}
