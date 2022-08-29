package com.example.k7hw1.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.k7hw1.data.model.Note

@Database(entities = [Note::class], version = 1)
abstract class AppDataBase:RoomDatabase() {
abstract fun historyDao():AppDao
}