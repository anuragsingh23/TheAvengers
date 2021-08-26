package com.example.theavengers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LogIn : AppCompatActivity() {

    lateinit var etMobileNumber: EditText
    lateinit var etPassword: EditText
    lateinit var btnLogIn: Button
    lateinit var txtForgetPassword: TextView
    lateinit var txtRegisterUser: TextView
    val validmobilenumber = "0123456789"
    val validpassword = arrayOf( "tony","steve", "bruce", "thanos")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        title = "Log In"
        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        btnLogIn = findViewById(R.id.btnLogIn)
        txtForgetPassword = findViewById(R.id.txtForgetPassword)
        txtRegisterUser = findViewById(R.id.txtRegister)

        btnLogIn.setOnClickListener {

            val mobileNumber = etMobileNumber.text.toString()

            val ppassword = etPassword.text.toString()

            val intent = Intent(
                this@LogIn,
                MainActivity::class.java
            )

            var nameOfAvenger = "Avenger"

            if ((mobileNumber == validmobilenumber)) {
                if (ppassword == validpassword[0]) {

                    nameOfAvenger = "Iron Man"
                    startActivity(intent)
                    intent.putExtra("Name", nameOfAvenger)

                } else if (ppassword == validpassword[1]) {

                    nameOfAvenger = "Captain America"
                    startActivity(intent)
                    intent.putExtra("Name", nameOfAvenger)

                } else if (ppassword == validpassword[2]) {

                    nameOfAvenger = "DR. Bruce Banner"
                    startActivity(intent)
                    intent.putExtra("Name", nameOfAvenger)

                } else if (ppassword == validpassword[3]) {

                    nameOfAvenger = "The Avengers"
                    startActivity(intent)
                    intent.putExtra("Name", nameOfAvenger)

                }


            } else {
                Toast.makeText(
                    this@LogIn,
                    "Wrong Credentials",
                    Toast.LENGTH_LONG
                ).show()
            }

        }
    }
}