package com.example.hotelproject.db

import androidx.annotation.DrawableRes
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.hotelproject.R

@Entity(tableName = "ReservedFoodsByTime_table")
data class ReservedFoodsByTime(
    @PrimaryKey(autoGenerate = true)
    var ReserveId:Int,
    var foodName:String,
    var price:Float,
    var foodGroup: String,
    var count:Int,
    val ReservedHour:Int,
    val ReservedMin:Int,
    val ReservedSec:Int
)


