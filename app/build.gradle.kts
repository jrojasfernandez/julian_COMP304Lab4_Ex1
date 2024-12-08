plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android") version "1.8.21"
}

android {
    namespace = "com.example.julian_comp304lab4_ex1"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.julian_comp304lab4_ex1"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.7"
    }

    kotlinOptions {
        jvmTarget = "17" // Fix for the "Unknown Kotlin JVM target" error
    }

    buildFeatures {
        compose = true
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    // Jetpack Compose
    implementation("androidx.compose.ui:ui:1.4.3")
    implementation("androidx.compose.material:material:1.4.3")
    implementation("androidx.compose.ui:ui-tooling-preview:1.4.3")
    debugImplementation("androidx.compose.ui:ui-tooling:1.4.3")
    implementation("androidx.compose.material3:material3:1.2.0")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // Room
    implementation("androidx.room:room-runtime:2.5.2")
    implementation("androidx.room:room-ktx:2.5.2") // KTX support for Room (avoiding kapt)

    // Navigation Compose
    implementation("androidx.navigation:navigation-compose:2.7.2")
    implementation("com.google.maps.android:maps-compose:2.11.2")
    implementation("com.google.android.gms:play-services-maps:18.1.0")
    // Kotlin Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    // Testing
    testImplementation("org.testng:testng:7.8.0")
}
