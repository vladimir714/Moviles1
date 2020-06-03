package com.example.moviles1.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.moviles1.repository.ToDoRepository
import com.example.moviles1.user.ToDo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ToDoViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: ToDoRepository
    val allToDoTasks: LiveData<List<ToDo>>

    init {
        repository= ToDoRepository(application, viewModelScope = CoroutineScope())
        allToDoTasks=repository.allToDoTasks
    }

    fun insert(toDo: ToDo){
        viewModelScope.launch(Dispatchers.IO){
            repository.insert(toDo)
        }
    }
    fun deleteTask(toDo: ToDo){
        viweModelScope.launch(Dispatchers.IO){
            repository.deleteTask(toDo)
        }
    }
}