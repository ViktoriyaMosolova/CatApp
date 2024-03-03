package com.mjollror.catapp.domain.repository

import com.mjollror.catapp.domain.model.CatFactModel

interface FactRepository {
    suspend fun getCatFact(): CatFactModel
}