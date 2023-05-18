package com.example.hotelproject.db

import androidx.annotation.DrawableRes
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.hotelproject.R

@Entity(tableName = "Food_table")
data class Food(
    @PrimaryKey(autoGenerate = true)
    var foodId:Int,
    var foodName:String,
    var price:Float,
    var picture:Int,
    var contentDescription:String,
    var foodGroup: String
)


