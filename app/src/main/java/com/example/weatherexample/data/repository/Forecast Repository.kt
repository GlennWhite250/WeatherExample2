package com.example.weatherexample.data.repository

import androidx.lifecycle.LiveData
import com.example.weatherexample.data.db.unitlocalized.UnitSpecificCurrentWeatherEntry

interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>
}