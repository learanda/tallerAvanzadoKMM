package ar.leandro.talleravanzadolean.model

import kotlinx.serialization.Serializable

@Serializable
data class CharacterResult(
    val id: Long,
    val name: String,
    val description: String,
    val thumbnail: Thumbnail
)