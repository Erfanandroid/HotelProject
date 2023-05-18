package com.example.hotelproject.db

import androidx.annotation.DrawableRes
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.hotelproject.R

@Entity(tableName = "ReservedFoods_table")
data class ReservedFoods(
    @PrimaryKey(autoGenerate = true)
    var ReserveId:Int,
    var foodName:String,
    var price:Float,
    var foodGroup: String,
    var count:Int
)


