package com.mjollror.catapp.di

import com.mjollror.catapp.presentation.MainActivity
import com.mjollror.catapp.presentation.facts.FactViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
    fun factViewModel() : FactViewModel
}