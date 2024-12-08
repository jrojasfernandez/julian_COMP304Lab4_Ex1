package com.example.julian_comp304lab4_ex1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MapScreen1()
        }
    }
}

@Composable
fun MapScreen1() {
    // Coordinates for Toronto
    val toronto = LatLng(4.7110, -74.0721)
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(toronto, 10f)
    }

    // Google Map with a marker
    GoogleMap(
        modifier = Modifier.fillMaxSize(),
        cameraPositionState = cameraPositionState
    ) {
        Marker(
            state = MarkerState(position = toronto),
            title = "Bogota",
            snippet = "This is Bogota, the city where I am from"
        )
    }
}
