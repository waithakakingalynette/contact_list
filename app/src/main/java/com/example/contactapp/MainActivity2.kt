package com.example.contactapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contactapp.databinding.ActivityMain2Binding
import com.example.contactapp.databinding.ContactListItemBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_main2)
    }

    override fun onResume() {
        super.onResume()
//        displayContacts()

        binding.btnNext.setOnClickListener {
            val intent = Intent(this, ContactListItemBinding::class.java)
            startActivity(intent)
        }
    }

}