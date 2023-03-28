package com.example.hotelproject.db

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface CustomerDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCustomer(customer: Customer)

    @Delete
    suspend fun deleteCustomer(customer: Customer)


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRoom(room: Room)

    @Delete
    suspend fun deleteRoom(room: Room)



}