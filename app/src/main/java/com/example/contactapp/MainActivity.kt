package com.example.contactapp

import android.content.Intent
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
//        castViews()
    }
    override fun onResume() {
        super.onResume()
        displayContacts()

       binding.ivadd.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

//    fun castViews(){
//        binding.rvContacts=findViewById(R.id.rvContacts)
//        binding.ivadd=findViewById(R.id.ivadd)
//    }

    fun displayContacts(){
        val contact1 = contactData(
            "Grace ",
            "https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8cGVvcGxlfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60",
            "+254 7987643843",
            "hsdlfjos"
        )
        val contact2 = contactData(
            "Warren ",
            "https://images.unsplash.com/photo-1531123414780-f74242c2b052?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fGFmcmljYW4lMjBwZXJzb258ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60",
            "+254 7867648976",
            "quqoowe"
        )
        val contact3 = contactData(
            "Joy ",
            "https://images.unsplash.com/photo-1534470717-233b39a41c54?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGFmcmljYW4lMjBwZXJzb258ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60",
            "+254 7234543845",
            "ywqiueyqiy"
        )
        val contact4 = contactData(
            "Lorraine ",
            "https://images.unsplash.com/photo-1522529599102-193c0d76b5b6?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fGFmcmljYW4lMjBwZXJzb258ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60",
            "+254 1234643845",
            "qwjgdj"
        )
        val contact5 = contactData(
            "Jane ",
            "https://images.unsplash.com/photo-1519689373023-dd07c7988603?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTd8fGFmcmljYW4lMjBwZXJzb258ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60",
            "+254 7867643809",
            "agsjsaidsaioy"
        )
        val contact6 = contactData(
            "Christoper ",
            "https://images.unsplash.com/photo-1520584229410-24ebf86ad31c?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fGFmcmljYW4lMjBwZXJzb258ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60",
            "+254 7567643845",
            "kjSKduja"
        )
        val contact7 = contactData(
            "Marry ",
            "https://images.unsplash.com/photo-1524660988542-c440de9c0fde?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8YWZyaWNhbiUyMHBlcnNvbnxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60",
            "+251 7456643845",
            "NVKF"
        )
        val contact8 = contactData(
            "Ephraim ",
            "https://plus.unsplash.com/premium_photo-1672872328365-abb550db7237?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8YWZyaWNhbiUyMHBlcnNvbnxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60",
            "+250 7867643845",
            "JDSL"
        )
        val contact9 = contactData(
            "Ishmail ",
            "https://images.unsplash.com/photo-1487546331507-fcf8a5d27ab3?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8YWZyaWNhbiUyMHBlcnNvbnxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60",
            "+250 7867643840",
            "NKLS"
        )
        val contact10 = contactData(
            " Wesley",
            "https://images.unsplash.com/file-1672938986796-3784922b755fimage?dpr=2&auto=format&fit=crop&w=416&q=60",
            "+254 7687643845",
            "KJSJA"
        )
        val contactList= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10)
        val contactRvAdapter=ContactRvAdapter(contactList)
        binding.rvContacts.layoutManager= LinearLayoutManager(this)
        binding.rvContacts.adapter=contactRvAdapter
    }
}