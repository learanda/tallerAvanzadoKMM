package ar.leandro.talleravanzadolean

import ar.leandro.talleravanzadolean.model.Character
import kotlin.test.Test
import kotlin.test.assertEquals

internal class CharacterComparatorTest {

    @Test
    fun `given two characters with empty description when compare them then it should return 1`() {
        val character1 = Character(1L, "Captain America", "", "url")
        val character2 = Character(2L, "Thor", "", "url")

        val result = CharacterComparator().compare(character1, character2)

        assertEquals(result, 1)
    }

    @Test
    fun `given two characters with not empty description when compare them then it should return -1`() {
        val character1 = Character(1L, "Captain America", "The First Avenger", "url")
        val character2 = Character(2L, "Thor", "Son of Odin", "url")

        val result = CharacterComparator().compare(character1, character2)

        assertEquals(result, -1)
    }

    @Test
    fun `given a character with not empty description and another one with empty description when compare them then it should return -1`() {
        val character1 = Character(1L, "Captain America", "The First Avenger", "url")
        val character2 = Character(2L, "Thor", "", "url")

        val result = CharacterComparator().compare(character1, character2)

        assertEquals(result, -1)
    }

    @Test
    fun `given a character with empty description and another one with not empty description when compare them then it should return 1`() {
        val character1 = Character(1L, "Captain America", "", "url")
        val character2 = Character(2L, "Thor", "Son of Odin", "url")

        val result = CharacterComparator().compare(character1, character2)

        assertEquals(result, 1)
    }

    @Test
    fun `given a character when compare it with another one like it then it should return 0`() {
        val character1 = Character(1L, "Captain America", "The First Avenger", "url")
        val character2 = Character(1L, "Captain America", "The First Avenger", "url")

        val result = CharacterComparator().compare(character1, character2)

        assertEquals(result, 0)
    }

}