package com.jd.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import java.util.concurrent.ConcurrentHashMap

class RetrofitFactory(
    private val defaultUrl: String,
    private val okHttpFactory: OkHttpFactory
) {

    private val hashMap = ConcurrentHashMap<String, Retrofit>()

    fun createRetrofitClient(baseUrl: String? = null): Retrofit =
        hashMap.getOrPut(baseUrl ?: defaultUrl) {
            val contentType = "application/json".toMediaType()

            Retrofit.Builder()
                .baseUrl(baseUrl?: defaultUrl)
                .client(okHttpFactory.client)
                .addConverterFactory(Json.asConverterFactory(contentType))
                .build()
        }

}