package com.example.soundrecorder.presentation.recording_screen

import android.content.Context
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.soundrecorder.domain.record.SoundRecorderImplementation
import java.io.File

@Composable
fun RecordScreen(
    context: Context
){

    val recorder by lazy {
        SoundRecorderImplementation(context)
    }

    var file: File? = null


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 100.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = {
                File("audio.mp3").also{
                    recorder.start(it)
                    file = it
                }

            }) {
                Text(text = "Start recording")
            }
            Button(onClick = {
                recorder.stop()
            }) {
                Text(text = "Stop recording")
            }
        }


        IconButton(
            onClick = {/*TODO*/ }
        ) {
            Icon(imageVector = Icons.Default.Edit, contentDescription = "Recordings")
        }

    }
}
