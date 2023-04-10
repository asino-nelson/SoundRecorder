package com.example.soundrecorder.presentation.recorded_list



import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.soundrecorder.data.Record
import com.example.soundrecorder.data.RecordRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RecordsViewModel @Inject constructor(
    @ApplicationContext context: ApplicationContext,
    private val recordRepo: RecordRepo
):ViewModel() {

    val allRecordings: Flow<List<Record>> = recordRepo.getAllRecords()

    fun getAllRecords() = viewModelScope.launch {
        recordRepo.getAllRecords()
    }

    fun deleteRecords(record: Record) = viewModelScope.launch {
        recordRepo.deleteRecord(record)
    }
}