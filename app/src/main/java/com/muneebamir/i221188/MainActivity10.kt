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

class MainActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main10)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val followersCount = findViewById<TextView>(R.id.followers_count)
        val followersText = findViewById<TextView>(R.id.followers)

        val intent = Intent(this, MainActivity11::class.java)

        followersCount.setOnClickListener {
            startActivity(intent)
        }

        followersText.setOnClickListener {
            startActivity(intent)
        }
        val followingCount = findViewById<TextView>(R.id.following_count)
        val followingText = findViewById<TextView>(R.id.following)

        val intent2 = Intent(this, MainActivity12::class.java)

        followingCount.setOnClickListener {
            startActivity(intent2)
        }

        followingText.setOnClickListener {
            startActivity(intent2)
        }

        val edit = findViewById<ImageView>(R.id.edit)

        edit.setOnClickListener {
            val intent = Intent(this, MainActivity13::class.java)
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

        val homeIcon = findViewById<ImageView>(R.id.homeicon)
        val homeText = findViewById<TextView>(R.id.hometext)

        val homeClickListener = View.OnClickListener {
            val intent6 = Intent(this, MainActivity4::class.java)
            startActivity(intent6)
        }

        homeIcon.setOnClickListener(homeClickListener)
        homeText.setOnClickListener(homeClickListener)





    }
}