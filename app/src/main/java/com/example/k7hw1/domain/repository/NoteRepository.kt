package com.example.k7hw1.domain.repository

import com.example.k7hw1.data.model.Note

interface NoteRepository {
   fun addNote(note: Note)
   fun getAllNotes():List<Note>
   fun editNote(note: Note)
   fun delete (note: Note)
}