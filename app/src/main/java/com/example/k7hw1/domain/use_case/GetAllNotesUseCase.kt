package com.example.k7hw1.domain.use_case

import com.example.k7hw1.domain.repository.NoteRepository
import javax.inject.Inject

class GetAllNotesUseCase @Inject constructor(private  val noteRepository: NoteRepository
) {
    fun getAllNotes() = noteRepository.getAllNotes()
}