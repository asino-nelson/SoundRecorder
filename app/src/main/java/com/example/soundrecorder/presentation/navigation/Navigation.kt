package com.example.soundrecorder.presentation.navigation

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.soundrecorder.data.Record
import com.example.soundrecorder.presentation.recorded_list.MyRecordings
import com.example.soundrecorder.presentation.recorded_list.RecordsViewModel
import com.example.soundrecorder.presentation.recording_screen.RecordScreen

@Composable
fun Navigation(
    context: Context,
    recordsViewModel: RecordsViewModel,
    record: Record
){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.RecordingScreen.route ){
        composable(route = Screens.RecordingScreen.route){
            RecordScreen(navController = navController , context = context)
        }

        composable(route = Screens.RecordsScreen.route){
            MyRecordings(
                record = record,
                navController = navController,
                recordsViewModel = recordsViewModel
            )
        }
    }

}