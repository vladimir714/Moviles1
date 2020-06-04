package com.example.moviles1.repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.moviles1.user.ToDo
import com.example.moviles1.user.ToDoDatabase
import kotlinx.coroutines.CoroutineScope
import java.util.List

class ToDoRepository(application: Application, viewModelScope: CoroutineScope) {

    private val toDoDAO = ToDoDatabase.getDatabase(
        application,
        viewModelScope
    ).todoDao()

    val allToDoTasks: LiveData<List<ToDo>> =toDoDAO.getTasksByDate()

    suspend fun deleteTask(toDo: ToDo){
        toDoDAO.deleteTask(toDo)
    }
    suspend fun deleteAll(){
        toDoDAO.deleteAll()
    }

    suspend fun insert(toDo: ToDo) {
        toDoDAO.insert(toDo)
    }

}