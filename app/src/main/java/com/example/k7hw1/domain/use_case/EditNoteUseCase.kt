package com.example.k7hw1.domain.use_case

import com.example.k7hw1.data.model.Note
import com.example.k7hw1.data.repository.NoteRepositoryImpl

class EditNoteUseCase(private  val noteRepositoryImpl:NoteRepositoryImpl) {
    fun getAllNotes() = noteRepositoryImpl.getAllNotes()
}