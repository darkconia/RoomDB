package com.example.roomdb.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.chrono.ChronoLocalDate
import java.time.chrono.ChronoLocalDateTime

@Entity(tableName = "daily_activity_table")
data class DailyActivity(

    @PrimaryKey(autoGenerate = true)
    var id : Int = 0,

    @ColumnInfo(name="date")
    var date: ChronoLocalDate ,

    @ColumnInfo(name="date_time_start_act")
    var dateTimeStartAct : ChronoLocalDateTime<ChronoLocalDate> ,

    @ColumnInfo(name="date_time_end_act")
    var dateTimeEndAct : ChronoLocalDateTime<ChronoLocalDate> ,

    @ColumnInfo(name="activity")
    var activity : String = "" ,

    @ColumnInfo(name="note")
    var note : String = "" ,

    @ColumnInfo(name="time_spend")
    var timeSpend : String = ""
)