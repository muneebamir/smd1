package com.muneebamir.i221188

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val usernameTextView = findViewById<TextView>(R.id.username)

        usernameTextView.setOnClickListener {
            startActivity(Intent(this, MainActivity6::class.java))
        }
        val imageView = findViewById<ImageView>(R.id.imageView)

        imageView.setOnClickListener {
            startActivity(Intent(this, MainActivity4::class.java))
        }

        val profileLayout = findViewById<RelativeLayout>(R.id.profile)

        profileLayout.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }




    }
}