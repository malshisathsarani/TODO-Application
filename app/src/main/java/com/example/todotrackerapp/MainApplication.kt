package com.example.todotrackerapp

import android.app.Application
import androidx.room.Room
import com.example.todotrackerapp.dao.TodoDatabase

class MainApplication : Application() {

    companion object{
        lateinit var todoDatabase: TodoDatabase
    }

    override fun onCreate() {
        super.onCreate()
        todoDatabase = Room.databaseBuilder(
            applicationContext,
            TodoDatabase::class.java,
            TodoDatabase.Name
        ).build()
    }
}