package com.example.soundrecorder


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.soundrecorder.domain.record.SoundRecorderImplementation
import com.example.soundrecorder.presentation.recording_screen.RecordScreenViewModel
import com.example.soundrecorder.ui.theme.SoundRecorderTheme
import dagger.hilt.android.AndroidEntryPoint
import java.io.File

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel:RecordScreenViewModel by viewModels()

//    private val recorder by lazy {
//        SoundRecorderImplementation(context)
//    }

    private val player by lazy {
        SoundRecorderImplementation(applicationContext)
    }

    private var file: File? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SoundRecorderTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

