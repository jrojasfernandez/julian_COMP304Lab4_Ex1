package com.example.julian_comp304lab4_ex1.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "weather")
data class WeatherEntity(
    @PrimaryKey val id: Int,
    val location: String,
    val temperature: Double,
    val description: String
)
