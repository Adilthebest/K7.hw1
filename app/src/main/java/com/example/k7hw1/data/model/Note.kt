package com.example.k7hw1.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "love_model")

data class Note (
    @PrimaryKey(autoGenerate = false)

    val id :Int? = null,
val title :String? = null,
val description :String? = null
        )
