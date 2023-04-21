package com.example.hotelproject.ui

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.hotelproject.db.Customer
import com.example.hotelproject.db.CustomerDao
import com.example.hotelproject.db.RoomTb

@Database(entities = [
    Customer::class,
  //  Food::class,
  RoomTb::class
]
,
    version = 1
)
abstract class HotelDatabase:RoomDatabase(){

    abstract fun getHotelDao(): CustomerDao

    companion object{
        @Volatile
        private var instance: HotelDatabase?=null
        private val LOCK=Any()

        //مورد operator function invoke بدین معناست که هر موقع آبجکتی از این کلاس ایجاد شود
        // این fun به صورت خودکار اجرا می شود.
        operator fun invoke(context: Context)=
            instance ?: synchronized(LOCK){
                instance ?: createDatabase(context).also {
                    instance =it
                }
            }

        private fun createDatabase(context: Context)=
            Room.databaseBuilder(
                context.applicationContext
                , HotelDatabase::class.java,
                "article_db.db"
            ).build()
    }

}