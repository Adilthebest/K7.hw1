package com.example.k7hw1.domain.use_case

import com.example.k7hw1.domain.model.Note
import com.example.k7hw1.domain.repository.NoteRepository
import javax.inject.Inject

class AddNoteUseCase @Inject constructor(private  val noteRepository:NoteRepository) {
    fun addNote(note:Note) = noteRepository.addNote(note)
}