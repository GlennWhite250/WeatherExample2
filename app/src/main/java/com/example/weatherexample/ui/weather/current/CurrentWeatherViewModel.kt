package com.example.weatherexample.ui.weather.current

import androidx.lifecycle.ViewModel
import com.example.weatherexample.data.provider.UnitProvider
import com.example.weatherexample.data.repository.ForecastRepository
import com.example.weatherexample.internal.UnitSystem
import com.example.weatherexample.internal.lazyDefered

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {
    private val unitSystem = unitProvider.getUnitSystem()
    val isMetric: Boolean
    get() = unitSystem == UnitSystem.METRIC
    val weather by lazyDefered {
        forecastRepository.getCurrentWeather(isMetric)
    }
    val weatherLocation by lazyDefered {
        forecastRepository.getWeatherLocation()
    }
}