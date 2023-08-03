package com.example.contactapp.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.contactapp.R
import com.example.contactapp.databinding.ContactListItemBinding
import com.example.contactapp.model.Contacts_Data
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactRvAdapter(var contactList:List<Contacts_Data>):RecyclerView.Adapter<ContactViewHolder>(){
    lateinit var contactListItemBinding: ContactListItemBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding=ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }



    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val currentContact=contactList.get(position)
        val binding=holder.binding
        binding.tvname.text=currentContact.name
        binding.tvcontact.text = currentContact.phoneNumber.toString()
        binding.ivavator.imageAlpha


        Picasso
            .get()
            .load(currentContact.imageUrl)
            .resize(80,80)
            .centerCrop()
            .placeholder(R.drawable.lynette)
            .transform(CropCircleTransformation())
            .error(R.drawable.lynette)
            .into(binding.ivavator)

    }
    override fun getItemCount(): Int {
        return contactList.size
    }

}

class ContactViewHolder(var binding:ContactListItemBinding):ViewHolder(binding.root){

}