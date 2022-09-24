package com.example.k7hw1.core

import com.example.k7hw1.data.model.NoteEntity
import com.example.k7hw1.domain.model.Note

fun NoteEntity.noteEntityToNote()=Note(
       id = this.id,
        title = this.title,
        description = this.description
    )
fun Note.noteToNoteEntity()=NoteEntity(
       id =  this.id,
        title = this.title,
        description = this.description

    )
