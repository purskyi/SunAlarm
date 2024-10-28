package com.example.sunalarm.bottom_navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object SunAlarm: BottomBarScreen(
        route = "sunAlarm",
        title = "SunAlarm",
        icon = Icons.Default.Star
    )
    object SunPosition: BottomBarScreen(
        route = "sunPosition",
        title = "SunPosition",
        icon = Icons.Default.LocationOn
    )
    object Settings: BottomBarScreen(
        route = "settings",
        title = "Settings",
        icon = Icons.Default.Settings
    )
}