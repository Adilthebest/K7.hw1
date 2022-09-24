package com.example.k7hw1.domain.use_case

import com.example.k7hw1.domain.model.Note
import com.example.k7hw1.domain.repository.NoteRepository
import javax.inject.Inject

class EditNoteUseCase @Inject constructor(private  val noteRepository: NoteRepository) {
    fun editNotes(note: Note) = noteRepository.editNote(note )
}