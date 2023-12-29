package com.app.bukutelpun.ui.home.repository

import com.app.bukutelpun.database.DatabaseClient
import com.app.bukutelpun.ui.home.item.PhoneBook
import javax.inject.Inject

class HomeRepository @Inject constructor(private val databaseClient: DatabaseClient) {

    suspend fun getUserContact(): MutableList<PhoneBook> {
        return databaseClient.appDatabase.userTask()?.getAllContact()!!
    }

}