package com.example.k7hw1.di

import android.content.Context
import androidx.room.Room
import com.example.k7hw1.data.repository.NoteRepositoryImpl
import com.example.k7hw1.domain.repository.NoteRepository
import com.example.k7hw1.room.AppDao
import com.example.k7hw1.room.NoteDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideAppDataBase(@ApplicationContext context: Context):NoteDataBase{
return Room.databaseBuilder(context,NoteDataBase::class.java,"database").allowMainThreadQueries().
fallbackToDestructiveMigration().build()
    }
    @Singleton
    @Provides
    fun provideAppDao(appDataBase: NoteDataBase) = appDataBase.noteDao()
    }
    @Provides
    fun provideNoteRepository(noteDao: AppDao):NoteRepository{
        return NoteRepositoryImpl(noteDao)

    }

