package com.example.hotelproject.db

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Customer_table")
data class Customer(
    val name:String="",
    val password:String="",
    val email:String?=null,
    val number:Int?=null
){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=null
}
