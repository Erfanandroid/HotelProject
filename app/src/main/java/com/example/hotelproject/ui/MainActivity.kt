package com.example.hotelproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.hotelproject.ui.EntryUi
import com.example.hotelproject.ui.SignUp
import com.example.hotelproject.ui.theme.HotelProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HotelProjectTheme {
              // EntryUi()
                SignUp()

            }
        }
    }
}

