package com.mjollror.catapp.domain.useCases

import com.mjollror.catapp.domain.model.CatFactModel
import com.mjollror.catapp.domain.repository.FactRepository

class GetFactUseCase(private val factRepository: FactRepository) {
    suspend operator fun invoke(): CatFactModel {
        return factRepository.getCatFact()
    }
}
