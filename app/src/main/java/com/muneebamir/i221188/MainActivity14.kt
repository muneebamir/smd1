package com.muneebamir.i221188

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity14 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main14)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val homeIcon = findViewById<ImageView>(R.id.homeicon)
        val homeText = findViewById<TextView>(R.id.hometext)

        val homeClickListener = View.OnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        homeIcon.setOnClickListener(homeClickListener)
        homeText.setOnClickListener(homeClickListener)






        val searchIcon = findViewById<ImageView>(R.id.searchicon)
        val searchText = findViewById<TextView>(R.id.searchtext)

        val searchClickListener = View.OnClickListener {
            val intent3 = Intent(this, MainActivity14::class.java)
            startActivity(intent3)
        }

        searchIcon.setOnClickListener(searchClickListener)
        searchText.setOnClickListener(searchClickListener)

        val addIcon = findViewById<ImageView>(R.id.addicon)

        addIcon.setOnClickListener {
            val intent4 = Intent(this, MainActivity15::class.java)
            startActivity(intent4)
        }


        val contactsIcon = findViewById<ImageView>(R.id.contactsicon)
        val contactsText = findViewById<TextView>(R.id.contactstext)

        val intent5 = Intent(this, MainActivity18::class.java)

        contactsIcon.setOnClickListener {
            startActivity(intent5)
        }

        contactsText.setOnClickListener {
            startActivity(intent5)
        }
    }
}