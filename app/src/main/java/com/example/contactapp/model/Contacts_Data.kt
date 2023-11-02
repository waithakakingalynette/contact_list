package com.example.contactapp.model
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Contacts")
data class Contacts_Data(
    @PrimaryKey(autoGenerate = true)
    var contactId: Int,
    var name: String,
    var phoneNumber: String,
    var email: String,
    var avator: String?
)
