package com.prenolan.mytamagotchiapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge

class MainActivity2 : AppCompatActivity() {
    //declare
    private lateinit var imageView: ImageView
    private lateinit var happyButton: Button
    private lateinit var hungerButton: Button
    private lateinit var bathButton: Button
    private lateinit var happyBar: ProgressBar
    private lateinit var hungerBar: ProgressBar
    private lateinit var bathBar: ProgressBar

    @SuppressLint("SuspiciousIndentation", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

    //initialise
    imageView =findViewById(R.id.imageView)
    happyButton =findViewById(R.id.happyButton)
    hungerButton =findViewById(R.id.hungerButton)
    bathButton =findViewById(R.id.bathButton)
    happyBar =findViewById(R.id.HappyBar)
    bathBar =findViewById(R.id.bathBar)
    hungerBar =findViewById(R.id.hungerBar)

        //increase the progress bar by 20
        happyButton.setOnClickListener {
            imageView.setImageResource(R.drawable.scooby_doo_playiing)
            happyBar.incrementProgressBy(20)
        }

        hungerButton.setOnClickListener {
            imageView.setImageResource(R.drawable.scooby_doo_eating_burger_image_600x338)
            hungerBar.incrementProgressBy(20)
        }

        bathButton.setOnClickListener {
            imageView.setImageResource(R.drawable.scooby_doo_bathing)
            bathBar.incrementProgressBy(20)
        }



    }
}