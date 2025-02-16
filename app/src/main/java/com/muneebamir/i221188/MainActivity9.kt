package com.muneebamir.i221188

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main9)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val callEnd = findViewById<ImageView>(R.id.callend)

        callEnd.setOnClickListener {
            startActivity(Intent(this, MainActivity6::class.java))
        }

        val videoCallButton = findViewById<ImageView>(R.id.videocall)

        videoCallButton.setOnClickListener {
            startActivity(Intent(this, MainActivity8::class.java))
        }

    }
}