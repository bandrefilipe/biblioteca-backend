package io.bandrefilipe.biblioteca.domain

data class ObraEntity(
    val id: Int,
    val titulo: String,
    val editora: String,
    val foto: String,
    val autores: List<String>,
)
