package com.mjollror.catapp.presentation.facts.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mjollror.catapp.presentation.facts.FactEvent
import com.mjollror.catapp.presentation.facts.FactViewModel

@Composable
fun GetFactButton(viewModel: FactViewModel) {
    Button(onClick = { viewModel.onEvent(FactEvent.GetFact) }, modifier = Modifier.fillMaxWidth()) {
        Text(text = "Get Fact", fontSize = 24.sp, modifier = Modifier.padding(16.dp))
    }
}