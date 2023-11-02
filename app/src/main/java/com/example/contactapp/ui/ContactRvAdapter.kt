package com.example.contactapp.ui

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.contactapp.R
import com.example.contactapp.databinding.ContactListItemBinding
import com.example.contactapp.model.Contacts_Data
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactRvAdapter(var contactList:List<Contacts_Data>,val context: Context):RecyclerView.Adapter<ContactViewHolder>() {
    lateinit var contactListItemBinding: ContactListItemBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = ContactListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
    }

override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
    val currentContact = contactList[position]
    val binding = holder.binding

    binding.tvname.text = currentContact.name
    binding.tvemail.text = currentContact.email
    binding.tvcontact.text = currentContact.phoneNumber

    if (!currentContact.avator.isNullOrBlank()) {
        Picasso
            .get()
            .load(currentContact.avator)
            .resize(80, 80)
            .centerCrop()
            .transform(CropCircleTransformation())
            .into(binding.ivavator)
    }

    binding.tvcontact.setOnClickListener {
        val intent = Intent(context, ContactDetails::class.java)

        intent.putExtra("CONTACT_ID", currentContact.contactId)

        context.startActivity(intent)
    }
}

    override fun getItemCount(): Int {
        return contactList.size
    }
}
class ContactViewHolder(var binding:ContactListItemBinding):ViewHolder(binding.root){

}