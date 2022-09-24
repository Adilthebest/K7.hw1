package com.example.k7hw1.room

import androidx.room.*
import com.example.k7hw1.data.model.NoteEntity

@Dao
interface AppDao {

@Insert(onConflict = OnConflictStrategy.REPLACE)
suspend fun addNote(noteEntity: NoteEntity)

@Query("SELECT * FROM notes")
suspend fun getAllNotes():List<NoteEntity>

@Update
suspend fun editNote(noteEntity: NoteEntity)

@Delete()
suspend fun deleteNote(noteEntity: NoteEntity)

}