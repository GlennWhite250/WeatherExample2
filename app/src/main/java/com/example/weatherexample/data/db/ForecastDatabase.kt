package com.example.weatherexample.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.weatherexample.data.db.entity.CurrentWeatherEntry
import com.example.weatherexample.data.db.entity.WeatherLocation


@Database(entities = [CurrentWeatherEntry::class, WeatherLocation::class], version = 1)
abstract class ForecastDatabase: RoomDatabase() {
    /**
     * This will return an instance of the Dao that was created
     */
    abstract fun currentWeatherDao(): CurrentWeatherDao
    abstract fun weatherLocationDao(): WeatherLocationDao

    /**
     * this is making the database a Singleton
     */
    companion object{
        @Volatile private var instance: ForecastDatabase? = null
        //This is for the threads to insure that no two things are doing anything at the sametime
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
            instance ?: buildDatabase(context).also { instance = it }
        }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext,
            ForecastDatabase::class.java,
            "forecast.db")
                .build()
    }
}