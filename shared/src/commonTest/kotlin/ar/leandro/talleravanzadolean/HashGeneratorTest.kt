package ar.leandro.talleravanzadolean

import kotlin.test.Test
import kotlin.test.assertEquals

class HashGeneratorTest {

    @Test
    fun `given MD5 when it has a valid input then it should return an md5 hash string`() {
        val text = "Example text to test hash generator"

        val result = HashGenerator.MD5(text)

        assertEquals(result, "9f33aee1aa720cb1a959595f20ff961f")
    }
}