package com.example.contactapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.contactapp.model.Contacts_Data

@Dao
interface ContactDao {

    @Insert(onConflict= OnConflictStrategy.REPLACE)
    fun insertContact(contact: Contacts_Data)

    @Query("SELECT * FROM Contacts ORDER BY name")
    fun getAllContacts():LiveData<List<Contacts_Data>>

    @Query("SELECT * FROM Contacts WHERE contactId = :contactId")
    fun getContactById(contactId: Int): LiveData<Contacts_Data?>

    @Query("DELETE  FROM Contacts WHERE contactId = :contactId")
    fun  deleteContact(contactId: Int)
}