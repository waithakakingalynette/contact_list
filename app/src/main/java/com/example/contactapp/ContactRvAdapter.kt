package com.example.contactapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.contactapp.databinding.ContactListItemBinding

class ContactRvAdapter(var contactList:List<contactData>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding=ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        var binding=holder.binding
        binding.tvname.text=currentContact.names
        binding.tvcontact.text= currentContact.contact.toString()
        binding.tvnames.text=currentContact.names
        binding.tvnames1.text=currentContact.names
//        binding.tvnames2.text=currentContact.names
        binding.tvcontact1.text=currentContact.contact.toString()
        binding.tvcontact2.text=currentContact.contact.toString()
        binding.tvcontact3.text=currentContact.contact.toString()
        binding.imageView.imageAlpha
        binding.imageView2.imageAlpha
        binding.imageView3.imageAlpha
        binding.imageView4.imageAlpha


    }

}

class ContactViewHolder(var binding:ContactListItemBinding):ViewHolder(binding.root){

}