package com.example.listview_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.listview_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val sentenceList = mutableListOf<String>();
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다");
        sentenceList.add("검정화면에 대충 흰글씨 쓰면");
        sentenceList.add("검정화면에 대충 흰글씨");
        sentenceList.add("검정화면에 대충");
        sentenceList.add("검정화면에");

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        val random = sentenceList.random();
        binding.text.setText(random);

        binding.btn.setOnClickListener {
            val intent = Intent(this, SentenceActivity::class.java);
            startActivity(intent);
        }
    }
}