package com.example.creatingbottomnvaigationwithbadges

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val route:String,
    val name:String,
    val icon:ImageVector,
    val badgeCount:Int=0
)
