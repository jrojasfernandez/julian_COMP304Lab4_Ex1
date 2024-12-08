package com.example.julian_comp304lab4_ex1.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.julian_comp304lab4_ex1.data.repository.WeatherRepository
import kotlinx.coroutines.launch

class WeatherViewModel(private val repository: WeatherRepository) : ViewModel() {
    fun fetchWeather(location: String) {
        viewModelScope.launch {
            repository.fetchWeather(location)
        }
    }
}
