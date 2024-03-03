package com.mjollror.catapp.presentation.facts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mjollror.catapp.presentation.facts.components.Fact
import com.mjollror.catapp.presentation.facts.components.GetFactButton

@Composable
fun FactScreen(viewModel: FactViewModel) {
    val state = viewModel.state.value
    Fact(text = state.fact, error = state.error)
    Spacer(modifier = Modifier.height(16.dp))
    Column(verticalArrangement = Arrangement.Bottom, modifier = Modifier.padding(16.dp)) {
        GetFactButton(viewModel)
    }
}