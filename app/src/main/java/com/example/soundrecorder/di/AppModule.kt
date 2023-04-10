package com.example.soundrecorder.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.soundrecorder.data.RecordDao
import com.example.soundrecorder.data.RecordDatabase
import com.example.soundrecorder.data.RecordRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRecordDatabase(@ApplicationContext context:Context):RecordDatabase{
        return Room.databaseBuilder(
            context = context,
            RecordDatabase::class.java,
            "record_db"
        ).build()
    }


    @Provides
    @Singleton
    fun provideRecordDao(recordDatabase: RecordDatabase):RecordDao{
        return recordDatabase.getRecordDao()
    }

    @Provides
    @Singleton
    fun provideRecordRepo(recordDao: RecordDao):RecordRepo{
        return RecordRepo(recordDao)
    }


}