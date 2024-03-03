package com.mjollror.catapp.presentation.facts.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Fact(text : String, error: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    )
    {
        Text(text = text, fontSize = 24.sp, fontWeight = FontWeight.Bold, lineHeight = 40.sp)
        if(error != null) Text(text = error, fontSize = 24.sp, fontWeight = FontWeight.Bold, lineHeight = 40.sp, color = Color.Red)
    }
}
