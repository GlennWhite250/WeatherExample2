package com.example.weatherexample.data.network.response

import androidx.room.ColumnInfo
import com.example.weatherexample.data.db.unitlocalized.UnitSpecificCurrentWeatherEntry

/**
 * This implements the database from the interface UnitSpecificCurrentWeatherEntry
 * This is for the Rest of the world
 */
data class MetricCurrentWeatherEntry(
    @ColumnInfo(name = "tempC")
    override val temperature: Double,
    @ColumnInfo(name = "condition_text")
    override val conditionText: String,
    @ColumnInfo(name = "condition_icon")
    override val conditionIconUrl: String,
    @ColumnInfo(name = "windKph")
    override val windSpeed: Double,
    @ColumnInfo(name = "windDir")
    override val windDirection: String,
    @ColumnInfo(name = "precipMm")
    override val precipitationVolume: Double,
    @ColumnInfo(name = "feelslikeC")
    override val feelsLikeTemperature: Double,
    @ColumnInfo(name = "visMiles")
    override val visibilityDistance: Double
): UnitSpecificCurrentWeatherEntry
