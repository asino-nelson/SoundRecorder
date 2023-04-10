package com.example.soundrecorder.presentation.navigation

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.soundrecorder.presentation.play.PlayScreen
import com.example.soundrecorder.presentation.recorded_list.MyRecordings
import com.example.soundrecorder.presentation.recording_screen.RecordScreen

@Composable
fun Navigation(context: Context){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.RecordingScreen.route ){
        composable(route = Screens.RecordingScreen.route){
            RecordScreen(navController = navController , context = context)
        }

        composable(route = Screens.RecordsScreen.route){
            MyRecordings(navController = navController)
        }
    }

}