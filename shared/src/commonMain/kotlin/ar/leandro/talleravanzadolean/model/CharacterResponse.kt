package ar.leandro.talleravanzadolean.model

import kotlinx.serialization.Serializable

@Serializable
data class CharactersResponse (
    val data: CharacterData
)
