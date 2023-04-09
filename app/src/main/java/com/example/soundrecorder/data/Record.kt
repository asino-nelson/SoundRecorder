package com.example.soundrecorder.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Record(
    @PrimaryKey(autoGenerate = true)
    val soundId:Int,
    val date:String,
    val duration:String
)
