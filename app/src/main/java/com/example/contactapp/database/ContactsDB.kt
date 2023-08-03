package com.example.contactapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.contactapp.model.Contacts_Data

@Database(entities = arrayOf(Contacts_Data::class), version = 1)
abstract class ContactsDB: RoomDatabase() {
    abstract fun getContactDao():ContactDao

    companion object{
        private var database:ContactsDB?=null

        fun getDatabase(context: Context):ContactsDB{
            if(database==null){
                database=Room.databaseBuilder(context,ContactsDB::class.java,"ContactsDB")
                    .build()
            }
            return database as ContactsDB
        }
    }

}
