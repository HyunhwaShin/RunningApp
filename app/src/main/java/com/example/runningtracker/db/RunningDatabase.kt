package com.example.runningtracker.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Run::class], version =1)
abstract class RunningDatabase :RoomDatabase(){

    abstract fun getRunDao() : RunDAO
}