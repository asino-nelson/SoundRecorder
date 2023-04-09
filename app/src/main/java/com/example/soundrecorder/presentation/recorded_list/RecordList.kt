package com.example.soundrecorder.presentation.recorded_list

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.soundrecorder.data.Record

@Composable
fun MyRecordings(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {

    }



}

@Composable
fun RecordItem(record: Record){

    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(20.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxSize().clickable {  },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(verticalArrangement = Arrangement.Center) {
                Text(
                    text = "${record.soundId}",
                    style = MaterialTheme.typography.h2,
                    fontWeight = FontWeight.Bold
                )
                Row(
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "${record.soundId}", style = MaterialTheme.typography.h2, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "${record.soundId}", style = MaterialTheme.typography.h2, fontWeight = FontWeight.Bold)
                }

            }

            Icon(
                imageVector = Icons.Default.PlayArrow,
                contentDescription = "Play",
                modifier = Modifier.clickable {  }
            )
        }

    }
}
