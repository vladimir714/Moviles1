package com.example.moviles1.user

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import androidx.sqlite.db.SupportSQLiteOpenHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import java.security.AccessControlContext

@Database(entities = arrayOf(ToDo::class),version = 1,exportSchema = false)
public abstract class ToDoDatabase :RoomDatabase() {
    abstract fun todoDao():ToDoDAO
    companion object{
        @Volatile
        private var INSTANCE:ToDoDatabase?=null

        fun getDatabase(context: Context, Scope: CoroutineScope): ToDoDatabase{
            val tempInstance = INSTANCE
            if (tempInstance!=null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ToDoDatabase::class.java,
                    "todo_database"
                ).addCallback(ToDoDatabaCallback(Scope)).build()
                INSTANCE=instance
                return instance
                )
            }
        }

        private class ToDoDatabaCallback(private val scope: CoroutineScope): RoomDatabase.Callback() {
        override fun onOpen(db:SupportSQLiteDatabase){
            super.onOpen(db)
            INSTANCE?.let { database ->
                scope.launch {
                    //ToDoDatabase
                }
            }
        }
        }
    }
}