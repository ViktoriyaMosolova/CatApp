package com.mjollror.catapp.data.mapper

import com.mjollror.catapp.data.model.CatFact
import com.mjollror.catapp.domain.model.CatFactModel

fun CatFact.toMapToDomainModel(): CatFactModel {
    return CatFactModel(fact = this.fact)
}
