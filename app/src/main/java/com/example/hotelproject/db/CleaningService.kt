package com.example.hotelproject.db

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Customer_table")
data class Customer(
    @PrimaryKey(autoGenerate = true)
    var id:Int?=null,
    var name:String?="",
    var password:String?="",
    var passwordRepeat:String?="",
    var email:String?="",
    var number:String?=""
)
