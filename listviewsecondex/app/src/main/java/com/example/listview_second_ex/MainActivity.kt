package com.example.listview_second_ex

import android.os.Bundle
import android.widget.ListAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main);


        val array = mutableListOf<String>()

        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");


        val listview = findViewById<ListView>(R.id.listviewId);
        val adaptor = Adaptor(array);
        listview.adapter = adaptor;
    }
}