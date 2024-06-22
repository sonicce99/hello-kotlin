package com.example.twice_app

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_image_inside)

        val data = intent.getStringExtra("data");
        var member_Image_Area = findViewById<ImageView>(R.id.member_Image_Area);

        if(data === "1") {
            member_Image_Area.setImageResource(R.drawable.member_1);
        }
//        Toast.makeText(this, data, Toast.LENGTH_LONG).show();
    }
}