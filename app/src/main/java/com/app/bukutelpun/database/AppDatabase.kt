package com.app.bukutelpun.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.app.bukutelpun.ui.home.item.PhoneBook

@Database(entities = [PhoneBook::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userTask(): DataEntity?
}