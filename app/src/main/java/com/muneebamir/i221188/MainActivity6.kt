package com.muneebamir.i221188

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main6)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val mainLayout = findViewById<RelativeLayout>(R.id.main)
        val imageView = findViewById<ImageView>(R.id.imageView)

        imageView.setOnClickListener {
            startActivity(Intent(this, MainActivity5::class.java))
        }
        val telephone = findViewById<ImageView>(R.id.telephone)

        telephone.setOnClickListener {
            startActivity(Intent(this, MainActivity8::class.java))
        }

        val videoCall = findViewById<ImageView>(R.id.videocall)

        videoCall.setOnClickListener {
            startActivity(Intent(this, MainActivity9::class.java))
        }


        var lastClickTime: Long = 0

        mainLayout.setOnClickListener {
            val currentTime = System.currentTimeMillis()
            if (currentTime - lastClickTime < 300) { // Double-click detected
                startActivity(Intent(this, MainActivity7::class.java))
            }
            lastClickTime = currentTime
        }

    }
}