package com.example.contactapp

import android.graphics.Typeface
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_detail)


        val name = intent.getStringExtra("detail_name")
        val detailNameTextView: TextView = findViewById(R.id.detail_name);
        detailNameTextView.text = name
        detailNameTextView.setTypeface(null, Typeface.BOLD)
//        findViewById<TextView>(R.id.detail_name).text = name
        findViewById<TextView>(R.id.detail_phone_number).text = intent.getStringExtra("detail_phone_number")
        findViewById<TextView>(R.id.detail_email).text = intent.getStringExtra("detail_mail")
    }

}