package com.example.contactapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.example.contactapp.databinding.ActivityMain2Binding
import com.example.contactapp.model.Contacts_Data
import com.example.contactapp.ui.MainActivity
import com.example.contactapp.viewModel.ContactsViewModel

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
    }

    fun validateAddContact() {
        val name = binding.etName.text.toString()
        val phoneNumber = binding.etContact.text.toString()
        val email = binding.etemail.text.toString()

        var error = false
        if (name.isBlank()) {
            binding.tilName.error = getString(R.string.app_name)
            error = true
        }
        if (phoneNumber.isBlank()) {
            binding.tilemail.error = (getString(R.string.email_required))
            error = true
        }
        if (email.isBlank()) {
            binding.tilcontact.error =getString(R.string.phone_number_required)
            error = true
        }
        if (!error) {
            val newContact=Contacts_Data(0,name,email,phoneNumber,"")
            contactsViewModel.saveContact(newContact)
            Toast.makeText(this,getString(R.string.contact_saved),Toast.LENGTH_SHORT).show()
            finish()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}