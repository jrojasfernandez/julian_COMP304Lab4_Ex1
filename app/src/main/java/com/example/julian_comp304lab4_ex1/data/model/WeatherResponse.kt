package com.example.julian_comp304lab4_ex1.data.model

data class WeatherResponse(
    val id: Int,
    val location: String,
    val temperature: Double,
    val description: String
)
