package com.example.weatherexample.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.weatherexample.data.db.entity.CURRENT_WEATHER_ID
import com.example.weatherexample.data.db.entity.CurrentWeatherEntry
import com.example.weatherexample.data.db.network.response.ImperialCurrentWeatherEntry
import com.example.weatherexample.data.db.network.response.MetricCurrentWeatherEntry

/**
 * These functions is used to put the data
 */
@Dao
interface CurrentWeatherDao {
    //This line ensures that the entry in the database is always replaced
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(weatherEntry: CurrentWeatherEntry)

    //This calls all the data from the database, there will be only one row/column at a time for metric
    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
    fun getWeatherMetric(): LiveData<MetricCurrentWeatherEntry>

    //This calls all the data from the database, there will be only one row/column at a time for imperial
    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
    fun getWeatherImperial(): LiveData<ImperialCurrentWeatherEntry>
}