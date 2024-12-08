package com.example.julian_comp304lab4_ex1.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WeatherCard(
    location: String,
    temperature: Double,
    description: String,
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onClick() }
    ) {
        Text(text = location, fontSize = 20.sp)
        Text(text = "Temperature: $temperature°C", fontSize = 16.sp)
        Text(text = "Description: $description", fontSize = 16.sp)
    }
}
