package com.mjollror.catapp.di

import com.mjollror.catapp.data.repository.FactRepositoryImpl
import com.mjollror.catapp.data.retrofit.ApiInterface
import com.mjollror.catapp.domain.repository.FactRepository
import com.mjollror.catapp.domain.useCases.GetFactUseCase
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class AppModule {
    @Singleton
    @Provides
    fun provideRetrofitInstance() : ApiInterface {
        return Retrofit.Builder()
            .baseUrl(ApiInterface.Base)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)
    }

    @Singleton
    @Provides
    fun provideFactRepository(api: ApiInterface) : FactRepository {
        return FactRepositoryImpl(api)
    }

    @Singleton
    @Provides
    fun provideGetFactUseCase(factRepository: FactRepository) =
        GetFactUseCase(factRepository)
}