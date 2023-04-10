package com.example.soundrecorder.data


import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class RecordRepo @Inject constructor(private val recordDao: RecordDao){

    fun getAllRecords(): Flow<List<Record>> = recordDao.getAllRecords()

    fun getRecord(id:Long) = recordDao.getRecord(id)

    suspend fun insertRecord(record: Record) = recordDao.insertRecord(record)

    suspend fun deleteRecord(record: Record) = recordDao.deleteRecord(record)
}