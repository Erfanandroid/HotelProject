package com.example.hotelproject.db

import androidx.room.Entity

@Entity(tableName = "rooms_table")
data class Room(
    val roomType:String="",
    val breakfast:Int,
    val lunch:Int,
    val dinner:Int,
    val reservationDate:Long,
    val Price:Float
)
