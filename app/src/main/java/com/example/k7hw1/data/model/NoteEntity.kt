package com.example.k7hw1.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")

data class NoteEntity (
    @PrimaryKey(autoGenerate = true)
    val id :Int? = null,
val title :String? = null,
val description :String? = null
        )
