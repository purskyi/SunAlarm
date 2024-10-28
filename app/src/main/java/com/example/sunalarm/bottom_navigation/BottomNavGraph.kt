package com.example.sunalarm.bottom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sunalarm.screens.SettingsScreen
import com.example.sunalarm.screens.SunAlarmScreen
import com.example.sunalarm.screens.SunPositionScreen

@Composable
fun BottomNavGraph(navController: NavHostController){
        NavHost(navController = navController,
        startDestination = BottomBarScreen.SunAlarm.route
    ) {
            composable(route = BottomBarScreen.SunAlarm.route){
                SunAlarmScreen()
            }
            composable(route = BottomBarScreen.SunPosition.route){
                SunPositionScreen()
            }
            composable(route = BottomBarScreen.Settings.route){
                SettingsScreen()
            }

    }
}