package com.example.k7hw1.di

import android.content.Context
import androidx.room.Room
import com.example.k7hw1.room.AppDao
import com.example.k7hw1.room.AppDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Singleton
    @Provides
    fun provideAppDataBase(@ApplicationContext context: Context):AppDataBase{
return Room.databaseBuilder(context,AppDataBase::class.java,"database").allowMainThreadQueries().
fallbackToDestructiveMigration().build()
    }
    @Singleton
    @Provides
    fun provideAppDao(appDataBase: AppDataBase):AppDao{
return appDataBase.historyDao()
    }

}