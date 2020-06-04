package com.example.moviles1.user;


import com.example.moviles1.Constants;
import androidx.lifecycle.LiveData;
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

import java.util.List

@Dao
interface ToDoDAO {

    @Query(" SELECT * from "+Constants.todoTable + " ORDER BY "+ Constants.taskDate+", "+Constants.taskTime+ " ASC ")
    fun getTasksByDate(): LiveData<List<ToDo>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert (toDo:ToDo)

    @Delete( )
    suspend fun deleteTask(toDo:ToDo)

    @Query("DELETE FROM " +Constants.todoTable)
    suspend fun deleteAll()
}