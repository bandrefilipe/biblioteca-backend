package io.bandrefilipe.biblioteca.domain

data class ObraVO(
    val titulo: String,
    val editora: String,
    val foto: String,
    val autores: List<String>,
)
