package com.example.k7hw1.room

import androidx.room.Dao
import androidx.room.Insert
import com.example.k7hw1.data.model.Note

@Dao
interface AppDao {
@Insert
fun insert(model: Note)
}