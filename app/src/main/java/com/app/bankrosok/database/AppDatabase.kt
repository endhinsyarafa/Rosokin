package com.app.bankrosok.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.app.bankrosok.database.dao.DatabaseDao
import com.app.bankrosok.model.ModelDatabase

@Database(entities = [ModelDatabase::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao?
}