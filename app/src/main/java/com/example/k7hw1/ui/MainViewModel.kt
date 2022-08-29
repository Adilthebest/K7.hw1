package com.example.k7hw1.ui

import androidx.lifecycle.ViewModel
import com.example.k7hw1.data.repository.NoteRepositoryImpl
import com.example.k7hw1.domain.use_case.AddNoteUseCase
import com.example.k7hw1.domain.use_case.DeletelNoteUseCase
import com.example.k7hw1.domain.use_case.EditNoteUseCase
import com.example.k7hw1.domain.use_case.GetAllNotesUseCase

class MainViewModel(
    private val addNoteUseCase: AddNoteUseCase,
    private val deleteNoteUseCase: DeletelNoteUseCase,
    private val editNoteUseCase: EditNoteUseCase,
    private val getAllNoteUseCase: GetAllNotesUseCase
):ViewModel() {

}