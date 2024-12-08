package com.example.julian_comp304lab4_ex1.data.model


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "weather_table")
data class WeatherEntity(
    @PrimaryKey val location: String,
    val temperature: Double,
    val description: String
)
