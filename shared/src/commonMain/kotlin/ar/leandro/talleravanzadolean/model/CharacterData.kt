package ar.leandro.talleravanzadolean.model

import kotlinx.serialization.Serializable

@Serializable
data class CharacterData (
    val results: List<CharacterResult>
)