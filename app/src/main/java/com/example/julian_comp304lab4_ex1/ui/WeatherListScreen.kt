package com.example.julian_comp304lab4_ex1.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.julian_comp304lab4_ex1.ui.components.WeatherCard

@Composable
fun WeatherListScreen(onNavigateToDetail: (String) -> Unit) {
    val sampleWeatherData = listOf(
        WeatherData("Toronto", 15.0, "Sunny"),
        WeatherData("Vancouver", 10.0, "Rainy"),
        WeatherData("Montreal", 5.0, "Snowy")
    )

    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(sampleWeatherData) { weather ->
            WeatherCard(
                location = weather.location,
                temperature = weather.temperature,
                description = weather.description,
                onClick = { onNavigateToDetail(weather.location) }
            )
        }
    }
}

data class WeatherData(val location: String, val temperature: Double, val description: String)
