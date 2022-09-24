package com.example.k7hw1.core

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

abstract class BaseActivity:AppCompatActivity() {

    protected fun <T> StateFlow<UiState<T>>.subscribe(
        error: (message: String) -> Unit,
        loading: () -> Unit,
        success: (data: T?) -> Unit
    ) {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                this@subscribe.collect {
                    when (it) {
                        is UiState.Error -> {
                            error(it.error)

                        }
                        is UiState.Loading -> {
                            loading()
                        }
                        is UiState.Success -> {
                            success(it.data)
                        }
                    }
                }

            }
        }

    }
}