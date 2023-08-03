package com.example.contactapp.repository

import com.example.contactapp.MyContactsApp
import com.example.contactapp.database.ContactsDB
import com.example.contactapp.model.Contacts_Data
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
//language used to talk with database is sequel. Room is a library that is a regional related mapper that translates kotlin language to a query that is understandable.
// It also serves as an intermediary btwn us using kotlin language and database that understands sequel.
class ContactsRepository {
    val database=ContactsDB.getDatabase(MyContactsApp.appContext)

    suspend fun saveContact(contact:Contacts_Data){
        withContext(Dispatchers.IO){
            database.getContactDao().insertContact(contact)
        }
    }
}