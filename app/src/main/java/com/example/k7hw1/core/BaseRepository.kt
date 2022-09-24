package com.example.k7hw1.core

import kotlinx.coroutines.flow.flow

abstract class BaseRepository {
    protected  fun  <T> doReguest(reguest:suspend ()-> T) = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(reguest()))
        }catch (e:Exception){
            emit(Resource.Error(e.localizedMessage?:"Unknown message"))
        }

    }
}