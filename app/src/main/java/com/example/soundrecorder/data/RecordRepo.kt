package com.example.soundrecorder.data


import javax.inject.Inject


class RecordRepo @Inject constructor(private val recordDao: RecordDao){

    fun getAllRecords(): List<Record> = recordDao.getAllRecords()

    fun getRecord(id:Int) = recordDao.getRecord(id)

    suspend fun insertRecord(record: Record) = recordDao.insertRecord(record)

    suspend fun deleteRecord(record: Record) = recordDao.deleteRecord(record)
}