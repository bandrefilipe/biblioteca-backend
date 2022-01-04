package io.bandrefilipe.biblioteca.api

import io.bandrefilipe.biblioteca.domain.ObraVO
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PostObrasRestController {

    @PostMapping(path = ["/obras"])
    fun postObrasEndpoint(@RequestBody requestBody: ObraVO): ResponseEntity<Unit> {
        TODO("implementar POST /obras")
    }
}
