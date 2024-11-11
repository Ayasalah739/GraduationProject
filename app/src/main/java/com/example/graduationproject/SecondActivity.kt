package com.example.graduationproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.graduationproject.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnLogIn = findViewById<Button>(R.id.btnLogInSecondActivity)
        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnSignUpSecondActivity = findViewById<Button>(R.id.btnSignUpSecondActivity)

        btnLogIn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnSignUpSecondActivity.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnBack.setOnClickListener {
            finish()
        }


    }
}
