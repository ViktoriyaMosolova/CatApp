package com.mjollror.catapp.data.retrofit

import com.mjollror.catapp.data.model.CatFact
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    companion object Util {
        const val Base = "https://catfact.ninja"
    }

    @GET("/fact")
    suspend fun getCatFact(): Response<CatFact>
}