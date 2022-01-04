package io.bandrefilipe.biblioteca.api

import io.bandrefilipe.biblioteca.domain.ObraEntity
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GetObrasRestController {

    @GetMapping(path = ["/obras/"])
    fun getObrasEndpoint(): ResponseEntity<List<ObraEntity>> {
        TODO("implementar GET /obras/")
    }
}
