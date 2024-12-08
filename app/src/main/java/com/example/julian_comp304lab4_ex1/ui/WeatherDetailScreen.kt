package com.example.julian_comp304lab4_ex1.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WeatherDetailScreen(location: String) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(text = "Weather Details")
        Text(text = "Location: $location")
        Text(text = "Temperature: 15°C") // Placeholder data
        Text(text = "Description: Sunny") // Placeholder data
    }
}
