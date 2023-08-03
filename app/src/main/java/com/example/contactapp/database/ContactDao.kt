package com.example.contactapp.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.contactapp.model.Contacts_Data

@Dao
interface ContactDao {


    @Insert(onConflict= OnConflictStrategy.REPLACE)
    fun insertContact(contact: Contacts_Data)
}