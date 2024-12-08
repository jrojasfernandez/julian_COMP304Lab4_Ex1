package com.example.julian_comp304lab4_ex1.data.repository

import com.example.julian_comp304lab4_ex1.data.database.WeatherDao
import com.example.julian_comp304lab4_ex1.data.database.WeatherEntity
import com.example.julian_comp304lab4_ex1.data.model.WeatherResponse
import com.example.julian_comp304lab4_ex1.network.WeatherApiService

class WeatherRepository(
    private val weatherDao: WeatherDao,
    private val apiService: WeatherApiService
) {
    suspend fun fetchWeather(location: String) {
        val response = apiService.getWeather(location)
        val entity = mapResponseToEntity(response) // Convert response to entity
        weatherDao.insertWeather(entity) // Insert entity into the database
    }

    private fun mapResponseToEntity(response: WeatherResponse): WeatherEntity {
        return WeatherEntity(
            id = response.id,
            location = response.location,
            temperature = response.temperature,
            description = response.description
        )
    }
}
