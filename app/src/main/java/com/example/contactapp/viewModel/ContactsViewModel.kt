package com.example.contactapp.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.contactapp.model.Contacts_Data
import com.example.contactapp.repository.ContactsRepository
import kotlinx.coroutines.launch

class ContactsViewModel:ViewModel() {
    val contactsRepo=ContactsRepository()

    fun saveContact(contact:Contacts_Data){
        viewModelScope.launch {
            contactsRepo.saveContact(contact)
        }
    }
}