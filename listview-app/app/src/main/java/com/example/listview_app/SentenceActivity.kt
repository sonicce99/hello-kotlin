package com.example.listview_app

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>();
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다");
        sentenceList.add("검정화면에 대충 흰글씨 쓰면");
        sentenceList.add("검정화면에 대충 흰글씨");
        sentenceList.add("검정화면에 대충");
        sentenceList.add("검정화면에");


        val sentenceAdaptor = ListViewAdaptor(sentenceList);
        val listView = findViewById<ListView>(R.id.sentenceListView);

        listView.adapter = sentenceAdaptor
    }
}