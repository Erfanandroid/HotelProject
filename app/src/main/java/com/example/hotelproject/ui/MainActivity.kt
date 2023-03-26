package com.example.hotelproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.MutableState
import androidx.lifecycle.LiveData
import com.example.hotelproject.navigation.Navigation
import com.example.hotelproject.ui.EntryUi
import com.example.hotelproject.ui.SignIn
import com.example.hotelproject.ui.SignUp
import com.example.hotelproject.ui.theme.HotelProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HotelProjectTheme {
            Navigation()


            }
        }
    }
}

