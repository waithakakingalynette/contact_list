package com.example.contactapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.contactapp.databinding.ContactListItemBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

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
        binding.ivavator.imageAlpha


        Picasso
            .get()
            .load(currentContact.avator)
//            .resize(80,80)
//            .centerCrop()
//            .placeholder(drawable.a)
            .transform(CropCircleTransformation())
//            .error(R.drawable.)
            .into(binding.ivavator)

    }

}

class ContactViewHolder(var binding:ContactListItemBinding):ViewHolder(binding.root){

}