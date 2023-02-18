package com.example.android_kotlin_retrofit_id

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface APIService {
    // ...

    @POST("/johncodeos-blog/ParseJSONRetrofitConvertersExample/main/simple.json")
    suspend fun getEmployee(): Response<MainActivity.SimpleJSONModel>

    // ...
}