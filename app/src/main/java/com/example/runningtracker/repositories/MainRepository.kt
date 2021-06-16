package com.example.runningtracker.repositories

import com.example.runningtracker.db.Run
import com.example.runningtracker.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDAO: RunDAO
){
    suspend fun insertRun(run : Run) = runDAO.insertRun(run)
    suspend fun deleteRun(run : Run) = runDAO.deleteRun(run)

    fun getAllRunSortedByDate() = runDAO.getAllRunSortedByDate()
    fun getAllRunSortedByDistance() = runDAO.getAllRunSortedByDistance()
    fun getAllRunSortedByTimeInMillis() = runDAO.getAllRunSortedByTimeINMillis()
    fun getAllRunSortedByAvgSpeed() = runDAO.getAllRunSortedByAvgSpeed()
    fun getAllRunSortedCaloriesBurned() = runDAO.getAllRunSortedByCaloriesBurned()

    fun getTotalAvgSpeed() = runDAO.getTotalAvgSpeed()
    fun getTotalDistance() = runDAO.getTotalDistance()
    fun getTotalCaloriesBurned() = runDAO.getTotalCaloriesBurned()
    fun getTotalTimeInMillis() = runDAO.getTotalTimeInMills()
}