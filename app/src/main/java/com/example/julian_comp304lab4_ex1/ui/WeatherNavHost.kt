package com.example.julian_comp304lab4_ex1.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun WeatherNavHost(
    navController: NavHostController = rememberNavController(),
    startDestination: String = "weather_list"
) {
    NavHost(navController = navController, startDestination = startDestination) {
        // List of weather items screen
        composable("weather_list") {
            WeatherListScreen(onNavigateToDetail = { location ->
                navController.navigate("weather_detail/$location")
            })
        }

        // Detailed weather information screen
        composable("weather_detail/{location}") { backStackEntry ->
            val location = backStackEntry.arguments?.getString("location") ?: "Unknown Location"
            WeatherDetailScreen(location = location)
        }
    }
}
