package io.bandrefilipe.biblioteca.config

import io.bandrefilipe.biblioteca.domain.ObraVO
import io.bandrefilipe.biblioteca.persistence.ObraRepository
import org.slf4j.LoggerFactory
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class BibliotecaBackendStartupRunner(
    private val obraRepository: ObraRepository,
) : ApplicationRunner {

    private val initialObras: List<ObraVO> = listOf(
        ObraVO(
            titulo = "Harry Potter",
            editora = "Rocco",
            foto = "https://i.imgur.com/UH3IPXw.jpg",
            autores = listOf("JK Rowling")
        ),
        ObraVO(
            titulo = "The Wheel of Time",
            editora = "Tor Books",
            foto = "https://upload.wikimedia.org/wikipedia/en/0/00/WoT01_TheEyeOfTheWorld.jpg",
            autores = listOf(
                "Robert Jordan",
                "Brandon Sanderson"
            )
        ),
        ObraVO(
            titulo = "A Song of Ice & Fire",
            editora = "Bentam Books",
            foto = "https://upload.wikimedia.org/wikipedia/en/d/dc/A_Song_of_Ice_and_Fire_book_collection_box_set_cover.jpg",
            autores = listOf("George RR Martin")
        )
    )

    override fun run(args: ApplicationArguments?) {
        initialObras.forEach { obra ->
            obraRepository.insert(obra).also {
                log.info("Inserting: $it")
            }
        }
    }

    companion object {
        private val log = LoggerFactory.getLogger(BibliotecaBackendStartupRunner::class.java)
    }
}
