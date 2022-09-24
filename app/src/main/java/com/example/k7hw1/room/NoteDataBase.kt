package com.example.k7hw1.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.k7hw1.data.model.NoteEntity

@Database(entities = [NoteEntity::class], version = 1)
abstract class NoteDataBase:RoomDatabase() {
abstract fun noteDao():AppDao
}