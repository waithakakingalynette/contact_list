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
        val contact1 = contactData(
            "Grace ",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ2dqPzm66I0AS-64rfoSXrTE0re1hDDQ7z9w&usqp=CAU",
            "+254 7987643843",
            "hsdlfjos"
        )
        val contact2 = contactData(
            "Warren ",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTCUFZ40bAS8moSAXgovl6HbuHmwRA5aBMZfw&usqp=CAU",
            "+254 7867648976",
            "quqoowe"
        )
        val contact3 = contactData(
            "Joy ",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQeo1TEOhYZfzy3lqkSmdqO5Q7ZW6S7WYkDCMMnPsOQ2s3hnObJmcg9ZGo-2Oaz5aVyqGo&usqp=CAU",
            "+254 7234543845",
            "ywqiueyqiy"
        )
        val contact4 = contactData(
            "Lorraine ",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQI9OCT6cFd5iM2IJrkRtfMI2E1_UIrM4WRQ2CjiobjB6xHVl0iihqs_6ySDvhOE_cO3TQ&usqp=CAU",
            "+254 1234643845",
            "qwjgdj"
        )
        val contact5 = contactData(
            "Jane ",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQVEn_qd9codALp96aeIML_TM5s93prnBb4mw&usqp=CAU",
            "+254 7867643809",
            "agsjsaidsaioy"
        )
        val contact6 = contactData(
            "Christoper ",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTle_kN45_S5RqpdIO3ZRLe9j8rN6umKW7dA&usqp=CAU",
            "+254 7567643845",
            "kjSKduja"
        )
        val contact7 = contactData(
            "Marry ",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4dbCF7pJl0PRFL-Nj4jDk-gOH-lFuast2JQ&usqp=CAU",
            "+251 7456643845",
            "NVKF"
        )
        val contact8 = contactData(
            "Ephraim ",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSZHfnsytV1d2H3DGSjj9549EcyMQtuFaLwew&usqp=CAU",
            "+250 7867643845",
            "JDSL"
        )
        val contact9 = contactData(
            "Ishmail ",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOlHOP6EM0daxoncDsli66tNCe5ZgoeGUhxA&usqp=CAU",
            "+250 7867643840",
            "NKLS"
        )
        val contact10 = contactData(
            " Wesley",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQGiKGnhLJIxEkEjqhdykCdxQwllUzfzm5-vQ&usqp=CAU",
            "+254 7687643845",
            "KJSJA"
        )
        val contactList= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10)
        val contactRvAdapter=ContactRvAdapter(contactList)
        binding.rvContacts.layoutManager= LinearLayoutManager(this)
        binding.rvContacts.adapter=contactRvAdapter
    }
}