package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contactapp.adapter.ContactAdapter
import com.example.contactapp.databinding.ActivityMainBinding
import com.example.contactapp.model.Contact

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var contactList = listOf<Contact>(
            Contact("Josefina Lehner", "555-555-5555", "JosefinaLehner@gmail.com", 1),
            Contact("Stuart Vandervort II", "123-456-7890", "stuart@example.com", 2),
            Contact("Maddison", "987-654-3210", "maddison@example.com", 3),
            Contact("Nguyen Cao Ky", "111-222-3333", "nguyenky@example.com", 4),
            Contact("Fanny Frammi", "999-888-7777", "Fanny@example.com", 5),
            Contact("Bill Gates", "444-333-2222", "Bill@example.com", 6),
            Contact("Ronaldo", "777-666-5555", "Cr7@example.com", 7),
            Contact("Alex Kazakis", "333-444-5555", "Alex@example.com", 8),
            Contact("Viktor Axelsen", "666-555-4444", "axelsen@example.com", 9),
            Contact("Chen Long", "222-333-4444", "long@example.com", 10)
        )

        binding.recyclerView.adapter = ContactAdapter(contactList)
        binding.recyclerView.setHasFixedSize(true)
    }
}