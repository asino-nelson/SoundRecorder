package com.example.soundrecorder.presentation.navigation

sealed class Screens(val route:String){
    object RecordingScreen: Screens("recording_screen")
    object RecordsScreen: Screens("records_screen")
    object PlayScreen: Screens("play_screen")
}
