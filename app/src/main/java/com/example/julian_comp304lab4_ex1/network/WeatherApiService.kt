package com.example.julian_comp304lab4_ex1.network

import com.example.julian_comp304lab4_ex1.data.model.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {
    @GET("data/2.5/weather")
    suspend fun getWeather(@Query("q") location: String): WeatherResponse
}
