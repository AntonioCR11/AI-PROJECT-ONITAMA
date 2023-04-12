package com.example.onitama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button

class MainMenu : AppCompatActivity() {
    lateinit var btVeryEasy : Button
    lateinit var btEasy : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main_menu)
        btVeryEasy = findViewById(R.id.btVeryEasy)
        btEasy = findViewById(R.id.btEasy)

        btVeryEasy.setOnClickListener {
            val intent = Intent(this,VeryEasy::class.java)
            startActivity(intent)
        }
        btEasy.setOnClickListener {
            val intent = Intent(this,Easy::class.java)
            startActivity(intent)
        }
    }
}