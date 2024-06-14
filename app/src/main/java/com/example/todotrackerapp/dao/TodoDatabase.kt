package com.example.todotrackerapp.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.todotrackerapp.Converter
import com.example.todotrackerapp.Todo

@Database(entities = [Todo::class], version = 1)
@TypeConverters(Converter::class)
abstract  class TodoDatabase : RoomDatabase(){

    companion object{
        const val Name= "Todo_DB"
    }

    abstract fun getTodoDao() : TodoDao
}