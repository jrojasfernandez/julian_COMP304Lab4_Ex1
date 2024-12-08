package com.example.julian_comp304lab4_ex1.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

@Composable
fun Theme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = lightColorScheme(), // Or darkColorScheme() if needed
        typography = Typography,
        content = content
    )
}
