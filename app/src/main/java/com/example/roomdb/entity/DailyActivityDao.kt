package com.example.roomdb.entity

import androidx.room.Dao
import java.time.chrono.ChronoLocalDate

@Dao
interface DailyActivityDao {
    fun insert(dailyAct : DailyActivity)
    fun update(dailyAct : DailyActivity)
    fun clear()
    fun getDailyAct(date : ChronoLocalDate):List<DailyActivity>?
}