package com.example.contactapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactapp.MainActivity2
import com.example.contactapp.R
import com.example.contactapp.databinding.ActivityMainBinding
import com.example.contactapp.model.Contacts_Data

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
        val contact1 = Contacts_Data(
            0,
            "",
            "",
            "hsdlfjos",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ2dqPzm66I0AS-64rfoSXrTE0re1hDDQ7z9w&usqp=CAU"
        )
        val contact2 =Contacts_Data(
            0,
            "",
            "",
            "quqoowe",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTCUFZ40bAS8moSAXgovl6HbuHmwRA5aBMZfw&usqp=CAU"
        )
        val contact3 =Contacts_Data(
            0,
            "",
            "",
            "ywqiueyqiy",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQeo1TEOhYZfzy3lqkSmdqO5Q7ZW6S7WYkDCMMnPsOQ2s3hnObJmcg9ZGo-2Oaz5aVyqGo&usqp=CAU"
        )
        val contact4 = Contacts_Data(
            0,
            "",
            "",
            "qwjgdj",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQI9OCT6cFd5iM2IJrkRtfMI2E1_UIrM4WRQ2CjiobjB6xHVl0iihqs_6ySDvhOE_cO3TQ&usqp=CAU"
        )
        val contact5 = Contacts_Data(
            0,
            "",
            "",
            "agsjsaidsaioy",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQVEn_qd9codALp96aeIML_TM5s93prnBb4mw&usqp=CAU"
        )
        val contact6 =Contacts_Data(
            0,
            "",
            "",
            "kjSKduja",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTle_kN45_S5RqpdIO3ZRLe9j8rN6umKW7dA&usqp=CAU"
        )
        val contact7 = Contacts_Data(
            0,
            "",
            "",
            "NVKF",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4dbCF7pJl0PRFL-Nj4jDk-gOH-lFuast2JQ&usqp=CAU"
        )
        val contact8 = Contacts_Data(
            0,
            "",
            "",
            "JDSL",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSZHfnsytV1d2H3DGSjj9549EcyMQtuFaLwew&usqp=CAU"
        )
        val contact9 = Contacts_Data(
            0,
            "",
            "",
            "NKLS",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOlHOP6EM0daxoncDsli66tNCe5ZgoeGUhxA&usqp=CAU"
        )
        val contact10 = Contacts_Data(
            0,
            "",
            "",
            "KJSJA",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQGiKGnhLJIxEkEjqhdykCdxQwllUzfzm5-vQ&usqp=CAU"
        )
        val contactList= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10)
        val contactRvAdapter= ContactRvAdapter(contactList)
        binding.rvContacts.layoutManager= LinearLayoutManager(this)
        binding.rvContacts.adapter=contactRvAdapter
    }
}