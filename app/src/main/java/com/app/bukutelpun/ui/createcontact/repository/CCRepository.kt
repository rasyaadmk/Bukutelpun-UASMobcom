package com.app.bukutelpun.ui.createcontact.repository

import com.app.bukutelpun.database.DatabaseClient
import com.app.bukutelpun.ui.home.item.PhoneBook
import javax.inject.Inject

class CCRepository @Inject constructor(private val databaseClient: DatabaseClient) {

    suspend fun getSingleUserContact(id: String): PhoneBook {
        return databaseClient.appDatabase.userTask()!!.getSingleContact(id)
    }

    suspend fun insertUserContact(phoneBook: PhoneBook): Int {
        return databaseClient.appDatabase.userTask()?.insertData(phoneBook)!!.toInt()
    }

    suspend fun updateUserContact(phoneBook: PhoneBook): Int {
        return databaseClient.appDatabase.userTask()?.updateUserContact(phoneBook)!!
    }

}