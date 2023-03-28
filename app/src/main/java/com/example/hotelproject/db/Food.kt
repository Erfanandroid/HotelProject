package com.example.hotelproject.db

import androidx.room.Entity

@Entity(tableName = "Food_table")
data class Food(
    var breakfast:MutableList<Int>,
    var lunch:MutableList<Int>,
    var dinner:MutableList<Int>,
    var extraMeal:MutableList<Int>
)
