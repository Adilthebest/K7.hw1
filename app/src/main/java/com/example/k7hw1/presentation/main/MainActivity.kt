package com.example.k7hw1.presentation.main

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.activity.viewModels
import com.example.k7hw1.core.BaseActivity
import com.example.k7hw1.databinding.ActivityMainBinding
import com.example.k7hw1.domain.model.Note
import com.example.k7hw1.ui.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity(){
    private lateinit var binding: ActivityMainBinding
    private val viewModel:MainViewModel by viewModels()
var i = 0

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
binding.btn.setOnClickListener {
    viewModel.addNote(Note(title = (++i).toString(), description = (++i).toString()))
}

                viewModel.addNoteState.subscribe({
                        error->

                    Toast.makeText(this@MainActivity,error,Toast.LENGTH_SHORT).show()


                },{

                },{
                    viewModel.getAllNotes()
                })
                viewModel.getAllNotesState.subscribe({error->
                    Toast.makeText(this@MainActivity,error,Toast.LENGTH_SHORT).show()

                },{

                },{data->
binding.resultsfragment.text = data.toString()
                })

    }

}