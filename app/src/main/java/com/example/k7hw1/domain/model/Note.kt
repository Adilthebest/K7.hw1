package com.example.k7hw1.domain.model


data class Note(
    val id: Int? = DEFAULT_ID,
    val title:String? = null,
    val description:String? = null

        ){
    companion object{
        const val  DEFAULT_ID = 0
    }
}