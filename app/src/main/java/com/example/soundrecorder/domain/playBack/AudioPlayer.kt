package com.example.soundrecorder.domain.playBack

import java.io.File

interface AudioPlayer {
    fun playFile(file:File)
    fun stop()
}