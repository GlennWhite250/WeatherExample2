package com.example.weatherexample.ui.weather.current

import androidx.lifecycle.ViewModel
import com.example.weatherexample.data.repository.ForecastRepository
import com.example.weatherexample.internal.UnitSystem
import com.example.weatherexample.internal.lazyDefered

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository
) : ViewModel() {
    private val unitSystem = UnitSystem.METRIC //get from settings laterr
    val isMetric: Boolean
    get() = unitSystem == UnitSystem.METRIC
    val weather by lazyDefered {
        forecastRepository.getCurrentWeather(isMetric)
    }
}