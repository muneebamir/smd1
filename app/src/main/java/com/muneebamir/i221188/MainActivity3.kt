package com.muneebamir.i221188

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        val loginTextView = findViewById<TextView>(R.id.loginpage)
        val registerButton = findViewById<RelativeLayout>(R.id.register)

        loginTextView.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }

        registerButton.setOnClickListener {
            startActivity(Intent(this, MainActivity4::class.java))
        }
    }
}