package com.mjollror.catapp

import android.app.Application
import com.mjollror.catapp.di.AppComponent
import com.mjollror.catapp.di.AppModule
import com.mjollror.catapp.di.DaggerAppComponent

class CatFactsApp : Application() {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()
    }

    fun getAppComponent() : AppComponent {
        return appComponent
    }
}