package com.example.hotelproject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hotelproject.ui.EntryUi
import com.example.hotelproject.ui.RoomSection
import com.example.hotelproject.ui.SignIn
import com.example.hotelproject.ui.SignUp

@Composable
fun Navigation(){
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination ="RoomScreen"){
        composable(
            route = "EntryScreen"
        ){
            EntryUi(navController = navController)
        }

        composable(
            route = "SingUpScreen"
        ){
            SignUp(navController = navController)
        }

        composable(
            route = "SingInScreen"
        ){
            SignIn(navController = navController)
        }

        composable(
            route="RoomScreen"
        ){
            RoomSection()
        }
    }
}