package com.example.shopxpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView

class splashScreen : AppCompatActivity() {

    lateinit var imageView: ImageView
    private lateinit var btnlogin:Button
    private lateinit var btnsignup:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()

        btnsignup=findViewById(R.id.btnsignup)
        btnlogin= findViewById(R.id.btnlogin)

            btnlogin.setOnClickListener {
                val intent=Intent(this@splashScreen, logIn::class.java)
                startActivity(intent)
            }
            btnsignup.setOnClickListener {
            val intent=Intent(this@splashScreen, signUp::class.java)
                startActivity(intent)
        }

    }
}