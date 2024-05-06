package com.prenolan.mytamagotchiapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    //declare
    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //initialise
        textView =findViewById(R.id.Greetings)
        button =findViewById(R.id.StartButton)
        imageView =findViewById(R.id.scooby)

        button.setOnClickListener {
            val intent = Intent (this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
    }
}