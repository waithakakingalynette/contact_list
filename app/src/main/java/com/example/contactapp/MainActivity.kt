package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        displayContacts()
    }

    fun displayContacts(){
        val contact1=contactData("Lynette",712345678,"warukira@gmail.com","564 in Jogoo road")
        val contact2=contactData("Ivy",712345678,"warukira@gmail.com","564 in Jogoo road")
        val contact3=contactData("Maureen",712345678,"warukira@gmail.com","564 in Jogoo road")
        val contact4=contactData("Milcah",712345678,"warukira@gmail.com","564 in Jogoo road")


        val contactList= listOf(contact1,contact2,contact3,contact4)
        val tvcontact=ContactRvAdapter(contactList)
        binding.rvContacts.layoutManager= LinearLayoutManager(this)
        binding.rvContacts.adapter=tvcontact

    }
}