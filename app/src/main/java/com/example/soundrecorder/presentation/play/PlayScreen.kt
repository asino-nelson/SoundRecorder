package com.example.soundrecorder.presentation.play

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.soundrecorder.domain.playBack.AudioPlayerImplementation
import java.io.File

@Composable
fun PlayScreen(context:Context){

    val player by lazy {
        AudioPlayerImplementation(context)
    }

    val file: File? = null

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            player.playFile(file ?: return@Button )
        }) {
            Text(text = "Play")
        }
        Button(onClick = {
            player.stop()
        }) {
            Text(text = "Pause")
        }
    }
}