package com.jd.network

import retrofit2.Retrofit

class NetworkModule(private val retrofitFactory: RetrofitFactory) {

    fun getClientInstance(baseUrl: String?): Retrofit =
        retrofitFactory.createRetrofitClient(baseUrl)

}