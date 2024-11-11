package com.example.graduationproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.graduationproject.R
import com.example.graduationproject.SecondActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSignUp = findViewById<Button>(R.id.btnSignUp)
        val btnForgotPassword = findViewById<Button>(R.id.btnForgotPassword)
        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnLogIn = findViewById<Button>(R.id.btnLogIn)

        btnSignUp.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        btnForgotPassword.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

        btnLogIn.setOnClickListener {
            val intent = Intent(this, OtpActivity::class.java)
            startActivity(intent)
        }

        btnBack.setOnClickListener {
            finish()
        }

    }
}
