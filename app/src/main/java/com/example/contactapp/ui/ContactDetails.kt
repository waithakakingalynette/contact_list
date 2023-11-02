package com.example.contactapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import com.example.contactapp.R
import com.example.contactapp.databinding.ActivityContactDetailsBinding
import com.example.contactapp.model.Contacts_Data
import com.example.contactapp.viewmodel.ContactsViewModel
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactDetails : AppCompatActivity() {
    var contactId=0
    private lateinit var  viewModel: ContactsViewModel

    lateinit var binding:ActivityContactDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityContactDetailsBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_contact_details)
//        binding.btDeleteContact.setOnClickListener {
//            deleteContact()
//        }

        viewModel= ContactsViewModel()
        val contactId = intent.getIntExtra("CONTACT_ID", 0)

        viewModel.getContactById(contactId).observe(this, Observer { contact ->
            if (contact != null) {
                displayContactDetails(contact)
                binding.btDeleteContact.setOnClickListener {
                    deleteContact()
                }
            }
            else {
                Toast.makeText(this, "Contact not found", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun displayContactDetails(contact: Contacts_Data) {
        binding.tvName.text = contact.name
        binding.tvOtherContact.text = contact.phoneNumber
        binding.tvEmail.text=contact.email
        if (!contact.avator.isNullOrEmpty()) {
//        if (contact?.avator?.isNotBlank() == true){
            Picasso
                .get()
                .load(contact.avator)
                .resize(80, 80)
                .centerCrop()
                .transform(CropCircleTransformation())
                .into(binding.imageView)
        }
    }

    private fun deleteContact() {
        viewModel.getContactById(contactId)
        Toast.makeText(this,"contact deleted", Toast.LENGTH_SHORT).show()
        finish()
    }

    }



