package com.example.k7hw1.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey


data class Note (

    val id:Int = DEFAULT_ID,
    val title :String? = null,
    val description :String? = null

        ){
    companion object{
        const val  DEFAULT_ID = 0
    }
}