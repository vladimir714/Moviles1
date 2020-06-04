package com.example.moviles1.user

import com.example.moviles1.Constants
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName= Constants.todoTable)
data class ToDo(
    @PrimaryKey(autoGenerate=true) val uid: Int,
    @ColumnInfo(name = Constants.taskTitle) val title: String?,
    @ColumnInfo(name = Constants.taskDate) val date: String?,
    @ColumnInfo(name = Constants.taskTime) val time: String?
)