package com.example.soundrecorder.presentation.recorded_list

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.soundrecorder.data.Record
import com.example.soundrecorder.presentation.navigation.Screens

@Composable
fun MyRecordings(
    record: Record,
    navController: NavController,
    recordsViewModel: RecordsViewModel
){
    val recordListState = recordsViewModel.allRecordings.collectAsState(initial = listOf())

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {

        items(count = recordListState.value.size ){

            RecordItem(record = record, navController = navController )

        }

    }



}

@Composable
fun RecordItem(record: Record,navController: NavController){

    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(20.dp)
        .clickable {
            navController.navigate(Screens.PlayScreen.route)
        }
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
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
                modifier = Modifier.clickable {
                    navController.navigate(Screens.PlayScreen.route)
                }
            )
        }

    }
}
