package com.example.weatherexample.data.provider

import com.example.weatherexample.internal.UnitSystem

interface UnitProvider {
    fun getUnitSystem(): UnitSystem
}