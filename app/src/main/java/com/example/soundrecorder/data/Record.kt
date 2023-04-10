package com.example.soundrecorder.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Record(
    @PrimaryKey(autoGenerate = true)
    val soundId:Long = 0,
    val date:String,
    val duration:Long
)
