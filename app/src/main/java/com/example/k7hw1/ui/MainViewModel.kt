package com.example.k7hw1.ui

import com.example.k7hw1.core.BaseViewModel
import com.example.k7hw1.core.UiState
import com.example.k7hw1.domain.model.Note
import com.example.k7hw1.domain.use_case.AddNoteUseCase
import com.example.k7hw1.domain.use_case.DeletelNoteUseCase
import com.example.k7hw1.domain.use_case.EditNoteUseCase
import com.example.k7hw1.domain.use_case.GetAllNotesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val addNoteUseCase: AddNoteUseCase,
    private val deleteNoteUseCase: DeletelNoteUseCase,
    private val editNoteUseCase: EditNoteUseCase,
    private val getAllNoteUseCase: GetAllNotesUseCase
):BaseViewModel() {
    private val _addNoteState = MutableStateFlow<UiState<Unit>>(UiState.Loading())
    val addNoteState = _addNoteState.asStateFlow()


    private val _getAllNotesState = MutableStateFlow<UiState<List<Note>>>(UiState.Loading())
    val getAllNotesState = _getAllNotesState.asStateFlow()


    fun addNote(note: Note) {
            addNoteUseCase.addNote(note).getData(
                { error->
                _addNoteState.value = UiState.Error(error ?:     "Unknown")
                },
                {
                _addNoteState.value = UiState.Loading()
                },
                {data->
                    if (data != null)
                        _addNoteState.value = UiState.Success(data)

                }

            )

    }

    fun getAllNotes() {
            getAllNoteUseCase.getAllNotes().getData(
                { error->
                    _getAllNotesState.value = UiState.Error(error ?: "Unknown")
                },
                {
                    _getAllNotesState.value = UiState.Loading()
                },
                { data ->
                    if (data != null)
                        _getAllNotesState.value = UiState.Success(data)
                })
                }
    }

