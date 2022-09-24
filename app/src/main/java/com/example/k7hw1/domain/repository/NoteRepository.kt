package com.example.k7hw1.domain.repository

import com.example.k7hw1.core.Resource
import com.example.k7hw1.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {
   fun addNote(note: Note): Flow<Resource<Unit>>

   fun getAllNotes():Flow<Resource<List<Note>>>

   fun editNote(note: Note):Flow<Resource<Unit>>

   fun delete (note: Note):Flow<Resource<Unit>>
}