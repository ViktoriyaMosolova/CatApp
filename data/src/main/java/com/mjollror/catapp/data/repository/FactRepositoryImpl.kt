package com.mjollror.catapp.data.repository

import com.mjollror.catapp.data.mapper.toMapToDomainModel
import com.mjollror.catapp.data.retrofit.ApiInterface
import com.mjollror.catapp.domain.model.CatFactModel
import com.mjollror.catapp.domain.repository.FactRepository
import java.io.IOException

class FactRepositoryImpl(private val api: ApiInterface) : FactRepository {
    override suspend fun getCatFact(): CatFactModel {
        val response = api.getCatFact()
        if (response.isSuccessful) {
            val body = response.body()
            return body!!.toMapToDomainModel()
        } else {
            val errorMessage = response.errorBody()?.string() ?: "Unknown error"
            throw IOException("Error getting cat fact: ${response.code()} $errorMessage")
        }
    }
}

