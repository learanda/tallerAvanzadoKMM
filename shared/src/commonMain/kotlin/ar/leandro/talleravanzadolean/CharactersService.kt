package ar.leandro.talleravanzadolean

import ar.leandro.talleravanzadolean.model.Character
import ar.leandro.talleravanzadolean.repository.CharactersRepository
import io.ktor.util.date.*

class CharactersService {

    private val charactersRepository = CharactersRepository()

    suspend fun getCharacters(): List<Character> {
        val timestamp = getTimeMillis()
        val charactersResponse = charactersRepository.get(
            timestamp,
            HashGenerator.MD5(timestamp.toString() + Constants.MARVEL_API_PRIVATE_KEY + Constants.MARVEL_API_PUBLIC_KEY)
        )

        val characters = charactersResponse.toModel()

        return sort(characters)
    }

    private fun sort(characters: List<Character>): List<Character> {
        return characters.sortedWith(CharacterComparator())
    }
}