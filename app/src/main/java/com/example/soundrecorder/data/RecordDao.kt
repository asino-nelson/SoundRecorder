package com.example.soundrecorder.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow


@Dao
interface RecordDao {

    @Query("SELECT * FROM record ORDER BY soundId DESC")
    fun getAllRecords(): Flow<List<Record>>

    @Query("SELECT * FROM record WHERE soundId LIKE :id ")
    fun getRecord(id: Long):Record

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecord(record: Record)

    @Delete
    suspend fun deleteRecord(record: Record)

}