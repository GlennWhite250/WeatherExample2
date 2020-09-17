package com.example.weatherexample.data.network.response

import com.example.weatherexample.data.db.entity.CurrentWeatherEntry
import com.example.weatherexample.data.db.entity.WeatherLocation
import com.google.gson.annotations.SerializedName


data class CurrentWeatherResponse(
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry,
    val Location: WeatherLocation
)