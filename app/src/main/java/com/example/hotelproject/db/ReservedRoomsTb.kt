package com.example.hotelproject.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "rooms_table")
data class RoomTb(
    @PrimaryKey(autoGenerate = false)
    var roomNumber:Int,
    var roomType:String="",
    var breakfast:Int,
    var lunch:Int,
    var dinner:Int,
   // val reservationDate:Long,
    var Price:Float
)
