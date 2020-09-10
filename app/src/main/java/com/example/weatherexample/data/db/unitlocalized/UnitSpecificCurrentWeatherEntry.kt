package com.example.weatherexample.data.db.unitlocalized


/**
 * This allows us to create the separate imperial and metric data classes to call
 * this is due to the fact that both measurements are very similar
 */
interface UnitSpecificCurrentWeatherEntry {
    val temperature: Double
    val conditionText: String
    val conditionIconUrl: String
    val windSpeed: Double
    val windDirection: String
    val precipitationVolume: Double
    val feelsLikeTemperature: Double
    val visibilityDistance: Double
}