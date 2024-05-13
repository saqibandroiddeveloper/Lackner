package com.saqiii.lackner

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Ktorrrrr {

    val client = HttpClient(OkHttp) {
    }
    suspend fun getWallpapers(): List<String> {
        return withContext(Dispatchers.IO) {
            client.get("link").body<List<String>>()
            client.post("link"){
                setBody(Login("",""))
            }.body<List<String>>()
        }
    }
}
data class Login(
    val email: String,
    val password: String,
)