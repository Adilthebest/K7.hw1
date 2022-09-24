package com.example.k7hw1.core

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

abstract class BaseViewModel: ViewModel() {

    protected fun <T> kotlinx.coroutines.flow.Flow <Resource<T>> .getData(

        error:(message:String?) -> Unit,
        loading :() -> Unit,
        success :(data:T?) ->Unit
    ) {

        viewModelScope.launch {
            this@getData.collect{
                when (it) {
                    is Resource.Loading -> {
                        loading()
                    }
                    is Resource.Success -> {
                        success(it.data)
                    }
                    is Resource.Error -> {
                        error(it.message)
                    }
                }
            }

        }
    }
}