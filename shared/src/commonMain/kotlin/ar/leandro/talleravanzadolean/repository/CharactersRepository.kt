package ar.leandro.talleravanzadolean.repository

import ar.leandro.talleravanzadolean.Constants
import ar.leandro.talleravanzadolean.initLogger
import ar.leandro.talleravanzadolean.model.CharactersResponse
import io.github.aakira.napier.Napier
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class CharactersRepository {

    private val httpClient = HttpClient {
        install(Logging) {
            level = LogLevel.ALL
            logger = object : Logger {
                override fun log(message: String) {
                    Napier.v(tag = "HttpClient", message = message)
                }
            }
        }
        install(ContentNegotiation) {
            json(
                Json {
                    ignoreUnknownKeys = true
                }
            )
        }
    }.also {
        initLogger()
    }

    suspend fun get(timestamp: Long, md5: String) : CharactersResponse {
        return httpClient.get {
            url("https://gateway.marvel.com/v1/public/characters")
            parameter("apikey", Constants.MARVEL_API_PUBLIC_KEY)
            parameter("ts", timestamp)
            parameter("hash", md5)
        }.body()
    }
}

