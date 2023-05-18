package com.example.hotelproject.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.hotelproject.other.BottomNavItem

@Composable
fun BottomNavigationBar(
    items:List<BottomNavItem>,
    navController: NavController,
    modifier: Modifier = Modifier,
    onItemClick: (BottomNavItem)->Unit
){
    val backStackEntry=navController.currentBackStackEntryAsState()
    BottomNavigation(
        backgroundColor = Color.DarkGray,
        elevation = 5.dp
        , modifier = modifier
    ) {
        items.onEach {item->
            val selected=item.route==backStackEntry.value?.destination?.route
            BottomNavigationItem(
                selected =selected
                ,
                onClick = {
                    onItemClick(item)
                },
                selectedContentColor = Color.Green,
                unselectedContentColor = Color.Gray
                ,
                icon = {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                            Icon(
                                imageVector =item.icon ,
                                contentDescription =item.name
                            )

                        if (selected){
                            Text(
                                text = item.name,
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp
                            )
                        }
                    }

                }
            )
        }
    }


}

@Composable
fun BottomBarNavigation(navController: NavHostController){
    NavHost(navController = navController, startDestination = "RoomScreen" ){
        composable(
            route = "RoomScreen"
        ){
            RoomSection()
        }
        composable(
            route = ""
        ){
            ChatScreen()
        }
        composable(
            route = "settings"
        ){
            SettingsScreen()
        }
    }

}
