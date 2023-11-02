package com.example.contactapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactapp.databinding.ActivityMainBinding
import com.example.contactapp.model.Contacts_Data
import com.example.contactapp.viewmodel.ContactsViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val contactsViewModel:ContactsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        contactsViewModel.getContacts()
            .observe(this, Observer {contactList->displayContacts(contactList)
            })
        binding.ivadd.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }


    fun displayContacts(contactList:List<Contacts_Data>){
        val contacts= ContactRvAdapter(contactList,this)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contacts

    }


}
