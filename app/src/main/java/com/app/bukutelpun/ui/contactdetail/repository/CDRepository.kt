package com.app.bukutelpun.ui.contactdetail.repository

import com.app.bukutelpun.database.DatabaseClient
import com.app.bukutelpun.ui.home.item.PhoneBook
import javax.inject.Inject

class CDRepository @Inject constructor(private val databaseClient: DatabaseClient) {

    suspend fun getSingleUserContact(id: String): PhoneBook {
        return databaseClient.appDatabase.userTask()!!.getSingleContact(id)
    }

    suspend fun deleteUserContact(id: String): Int {
        return databaseClient.appDatabase.userTask()!!.deleteContactById(id)
    }

}