package com.example.hello_kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val bts_image_1 = findViewById<ImageView>(R.id.bts_image_1);
        bts_image_1.setOnClickListener {
            Toast.makeText(this, "1번 사진 클릭 완료", Toast.LENGTH_LONG).show();

            val intent = Intent(this, BTS1Activity::class.java)
            startActivity(intent);
        }
    }
}