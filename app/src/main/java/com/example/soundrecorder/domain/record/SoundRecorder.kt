package com.example.soundrecorder.domain.record

import java.io.File

interface SoundRecorder {
    fun start(outputFile: File)
    fun stop()
}