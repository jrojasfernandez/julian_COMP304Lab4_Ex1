package com.example.julian_comp304lab4_ex1.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.julian_comp304lab4_ex1.data.database.WeatherDao
import com.example.julian_comp304lab4_ex1.data.database.WeatherEntity

@Database(entities = [WeatherEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun weatherDao(): WeatherDao
}
