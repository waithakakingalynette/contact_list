package com.example.contactapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.example.contactapp.R
import com.example.contactapp.databinding.ActivityMain2Binding
import com.example.contactapp.model.Contacts_Data
import com.example.contactapp.viewmodel.ContactsViewModel



class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    val contactsViewModel:ContactsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.btnNext.setOnClickListener {
            validateAddContact()
        }
        binding.ivAvator.setOnClickListener{

        }
    }

    private fun capturephoto{
        val photoOnset=Intent()
    }
    fun validateAddContact() {
        val name = binding.etName.text.toString()
        val email = binding.etemail.text.toString()
        val phoneNumber = binding.etContact.text.toString()

        var error = false
        if (name.isBlank()) {
            binding.tilName.error = "enter firstname"
            error = true
        }
        if (phoneNumber.isBlank()) {
            binding.tilemail.error = "enter email"
            error = true
        }
        if (email.isBlank()) {
            binding.tilcontact.error ="enter phone number"
            error = true
        }
        if (!error) {
            val newContact=Contacts_Data(0,name,email,phoneNumber,"")
            contactsViewModel.saveContact(newContact)
            Toast.makeText(this,getString(R.string.contact_saved),Toast.LENGTH_SHORT).show()
            finish()
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
        }

    }
}