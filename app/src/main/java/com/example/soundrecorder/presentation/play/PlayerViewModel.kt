package com.example.soundrecorder.presentation.play

import androidx.lifecycle.ViewModel
import com.example.soundrecorder.data.RecordRepo
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class PlayerViewModel@Inject constructor(
    @ApplicationContext
    private val recordRepo: RecordRepo
):ViewModel() {

    fun getAllRecords() = recordRepo.getAllRecords()
}