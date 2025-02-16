package com.muneebamir.i221188

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.StyleSpan
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val sendButton = findViewById<ImageView>(R.id.send1)

        sendButton.setOnClickListener {
            startActivity(Intent(this, MainActivity5::class.java))
        }

        val profileIcon = findViewById<ImageView>(R.id.profileicon)
        val profileText = findViewById<TextView>(R.id.profiletext)

        val intent = Intent(this, MainActivity10::class.java)

        profileIcon.setOnClickListener {
            startActivity(intent)
        }

        profileText.setOnClickListener {
            startActivity(intent)
        }


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