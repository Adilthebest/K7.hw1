package com.example.k7hw1.domain.use_case

import com.example.k7hw1.data.model.Note
import com.example.k7hw1.data.repository.NoteRepositoryImpl

class AddNoteUseCase(private  val noteRepositoryImpl:NoteRepositoryImpl) {
    fun addNote(note: Note) = noteRepositoryImpl.addNote(note)
}