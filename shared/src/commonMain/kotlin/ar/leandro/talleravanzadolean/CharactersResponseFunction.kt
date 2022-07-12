package ar.leandro.talleravanzadolean

import ar.leandro.talleravanzadolean.model.Character
import ar.leandro.talleravanzadolean.model.CharactersResponse

fun CharactersResponse.toModel(): List<Character> {
    return this.data.results.map {
        Character(
            id = it.id,
            name = it.name,
            description = it.description,
            thumbnailUrl = it.thumbnail.toUrl()
        )
    }
}