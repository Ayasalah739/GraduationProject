package com.example.graduationproject

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class OtpActivity : AppCompatActivity() {

    private lateinit var otpDigit1: EditText
    private lateinit var otpDigit2: EditText
    private lateinit var otpDigit3: EditText
    private lateinit var otpDigit4: EditText
    private lateinit var otpDigit5: EditText
    private lateinit var otpDigit6: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)

        otpDigit1 = findViewById(R.id.otpDigit1)
        otpDigit2 = findViewById(R.id.otpDigit2)
        otpDigit3 = findViewById(R.id.otpDigit3)
        otpDigit4 = findViewById(R.id.otpDigit4)
        otpDigit5 = findViewById(R.id.otpDigit5)
        otpDigit6 = findViewById(R.id.otpDigit6)
        val btnBack = findViewById<Button>(R.id.btnBack)

        otpDigit1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(charSequence: CharSequence?, start: Int, before: Int, count: Int) {
                if (charSequence?.length == 1) {
                    otpDigit2.requestFocus()
                }
            }

            override fun afterTextChanged(editable: Editable?) {}
        })

        otpDigit2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(charSequence: CharSequence?, start: Int, before: Int, count: Int) {
                if (charSequence?.length == 1) {
                    otpDigit3.requestFocus()
                } else if (charSequence.isNullOrEmpty()) {
                    otpDigit1.requestFocus()
                }
            }

            override fun afterTextChanged(editable: Editable?) {}
        })

        otpDigit3.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(charSequence: CharSequence?, start: Int, before: Int, count: Int) {
                if (charSequence?.length == 1) {
                    otpDigit4.requestFocus()
                } else if (charSequence.isNullOrEmpty()) {
                    otpDigit2.requestFocus()
                }
            }

            override fun afterTextChanged(editable: Editable?) {}
        })

        otpDigit4.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(charSequence: CharSequence?, start: Int, before: Int, count: Int) {
                if (charSequence?.length == 1) {
                    otpDigit5.requestFocus()
                } else if (charSequence.isNullOrEmpty()) {
                    otpDigit3.requestFocus()
                }
            }

            override fun afterTextChanged(editable: Editable?) {}
        })

        otpDigit5.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(charSequence: CharSequence?, start: Int, before: Int, count: Int) {
                if (charSequence?.length == 1) {
                    otpDigit6.requestFocus()
                } else if (charSequence.isNullOrEmpty()) {
                    otpDigit4.requestFocus()
                }
            }

            override fun afterTextChanged(editable: Editable?) {}
        })

        otpDigit6.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(charSequence: CharSequence?, start: Int, before: Int, count: Int) {
                if (charSequence.isNullOrEmpty()) {
                    otpDigit5.requestFocus()
                }
            }

            override fun afterTextChanged(editable: Editable?) {}
        })
        btnBack.setOnClickListener {
            finish()
        }
    }
}
