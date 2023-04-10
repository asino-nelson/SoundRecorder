package com.example.soundrecorder.presentation.play


import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.soundrecorder.data.Record
import com.example.soundrecorder.data.RecordRepo
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.launch
import javax.inject.Inject

class PlayerViewModel@Inject constructor(
    @ApplicationContext
    private val recordRepo: RecordRepo
):ViewModel() {

    val allRecordings: LiveData<List<Record>> = TODO()

    fun getAllRecords() = viewModelScope.launch {
        recordRepo.getAllRecords()
    }

    fun deleteRecords(record: Record) = viewModelScope.launch {
        recordRepo.deleteRecord(record)
    }
}