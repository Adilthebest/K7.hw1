package com.example.k7hw1.data.repository

import com.example.k7hw1.core.*
import com.example.k7hw1.domain.model.Note
import com.example.k7hw1.domain.repository.NoteRepository
import com.example.k7hw1.room.AppDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NoteRepositoryImpl@Inject constructor(private var noteDao:AppDao):NoteRepository,BaseRepository() {

    override fun addNote(note: Note): Flow<Resource<Unit>> = doReguest {
        noteDao.addNote(note.noteToNoteEntity())
    }

    override fun getAllNotes(): Flow<Resource<List<Note>>> = doReguest {
        noteDao.getAllNotes().map { entity ->
            entity.noteEntityToNote()

        }
    }
    override fun editNote(note: Note): Flow<Resource<Unit>> = doReguest {
        noteDao.editNote(note.noteToNoteEntity())

    }


    override fun delete(note: Note): Flow<Resource<Unit>> = doReguest {
        noteDao.deleteNote(note.noteToNoteEntity())
    }
}