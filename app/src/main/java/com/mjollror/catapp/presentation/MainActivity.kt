package com.mjollror.catapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.mjollror.catapp.CatFactsApp
import com.mjollror.catapp.ui.theme.CatAppTheme
import com.mjollror.catapp.presentation.facts.FactScreen
import com.mjollror.catapp.presentation.facts.FactViewModel
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var factViewModel: FactViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        val appComponent = (application as CatFactsApp).getAppComponent()
        appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContent {
            CatAppTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FactScreen(factViewModel)
                }
            }
        }
    }
}

