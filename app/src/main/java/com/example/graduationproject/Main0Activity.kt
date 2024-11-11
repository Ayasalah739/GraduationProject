package com.example.graduationproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.graduationproject.R
import com.example.graduationproject.SecondActivity

class Main0Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main0)

        val btnGetStarted = findViewById<Button>(R.id.btnGetStarted)
        val btnAlreadyHaveAccount0 = findViewById<Button>(R.id.btnAlreadyHaveAccount0)

        btnGetStarted.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        btnAlreadyHaveAccount0.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}