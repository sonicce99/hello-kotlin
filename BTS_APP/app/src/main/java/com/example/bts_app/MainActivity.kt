package com.example.bts_app

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val bts_1 = findViewById<ImageView>(R.id.bts_1);
        val bts_2 = findViewById<ImageView>(R.id.bts_2);
        val bts_3 = findViewById<ImageView>(R.id.bts_3);
        val bts_4 = findViewById<ImageView>(R.id.bts_4);
        val bts_5 = findViewById<ImageView>(R.id.bts_5);
        val bts_6 = findViewById<ImageView>(R.id.bts_6);
        val bts_7 = findViewById<ImageView>(R.id.bts_7);

        bts_1.setOnClickListener {
            showImageDialog(R.drawable.bts_1);
        }

        bts_2.setOnClickListener {
            showImageDialog(R.drawable.bts_2);
        }

        bts_3.setOnClickListener {
            showImageDialog(R.drawable.bts_3);
        }

        bts_4.setOnClickListener {
            showImageDialog(R.drawable.bts_4);
        }

        bts_5.setOnClickListener {
            showImageDialog(R.drawable.bts_5);
        }

        bts_6.setOnClickListener {
            showImageDialog(R.drawable.bts_6);
        }

        bts_7.setOnClickListener {
            showImageDialog(R.drawable.bts_7);
        }
    }

    private fun showImageDialog(image: Int) {
        val dialog = Dialog(this);
        dialog.setContentView(R.layout.dialog_image);

        val imageView: ImageView = dialog.findViewById(R.id.dialogImageView)
        imageView.setImageResource(image);

        dialog.show()
    }
}