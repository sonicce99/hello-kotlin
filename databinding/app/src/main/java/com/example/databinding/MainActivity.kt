package com.example.databinding

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//        1번 방식 findViewById
//        val btn = findViewById<Button>(R.id.btn);

//        btn.setOnClickListener {
//            Toast.makeText(this, "click", Toast.LENGTH_LONG).show();
//        }

//      데이터 바인딩 방식
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.btn.setOnClickListener{
            Toast.makeText(this, "click", Toast.LENGTH_LONG).show();
        }


        Log.d("MainActivity", "testLog")
    }
}