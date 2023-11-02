package com.example.contactapp.repository

import androidx.lifecycle.LiveData
import com.example.contactapp.MyContactsApp
import com.example.contactapp.database.ContactDao
import com.example.contactapp.database.ContactsDB
import com.example.contactapp.model.Contacts_Data
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class ContactsRepository {
    val database = ContactsDB.getDatabase(MyContactsApp.appContext)

    suspend fun saveContact(contact: Contacts_Data) {
        withContext(Dispatchers.IO) {
            database.getContactDao().insertContact(contact)
        }
    }

    fun getAllContacts(): LiveData<List<Contacts_Data>> {
        return database.getContactDao().getAllContacts()
    }

    fun getContactById(contactId: Int): LiveData<Contacts_Data?> {
        return database.getContactDao().getContactById(contactId)
    }


    fun deleteContact(contactId: Int){
        return database.getContactDao().deleteContact(contactId)
    }
}

