package com.example.weatherexample.data.network.response

import androidx.room.ColumnInfo
import com.example.weatherexample.data.db.unitlocalized.UnitSpecificCurrentWeatherEntry

/**
 * This implements the database from the interface UnitSpecificCurrentWeatherEntry
 * This is for the US
 */
data class ImperialCurrentWeatherEntry(
    @ColumnInfo(name = "temp_f")
    override val temperature: Double,
    @ColumnInfo(name = "condition_text")
    override val conditionText: String,
    @ColumnInfo(name = "condition_icon")
    override val conditionIconUrl: String,
    @ColumnInfo(name = "wind_mph")
    override val windSpeed: Double,
    @ColumnInfo(name = "wind_dir")
    override val windDirection: String,
    @ColumnInfo(name = "precip_in")
    override val precipitationVolume: Double,
    @ColumnInfo(name = "feelslike_f")
    override val feelsLikeTemperature: Double,
    @ColumnInfo(name = "vis_miles")
    override val visibilityDistance: Double
): UnitSpecificCurrentWeatherEntry