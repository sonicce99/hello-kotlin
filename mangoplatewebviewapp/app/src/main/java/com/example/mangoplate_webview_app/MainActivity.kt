package com.example.mangoplate_webview_app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<RVModel>();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        items.add(
            RVModel(
                "https://m.naver.com/",
                "https://m.search.naver.com/search.naver?ssc=tab.m_image.all&where=m_image&sm=mtb_jum&query=%EC%9D%8C%EC%8B%9D#imgId=image_sas%3Ablog_44c75142939b2ff73eac17fbf01c1906",
                "셀트리온"

            )
        );

        items.add(
            RVModel(
                "https://m.naver.com/",
                "https://m.search.naver.com/search.naver?ssc=tab.m_image.all&where=m_image&sm=mtb_jum&query=%EC%9D%8C%EC%8B%9D#imgId=image_sas%3Ablog_44c75142939b2ff73eac17fbf01c1906",
                "셀트리온제약"

            )
        );

        items.add(
            RVModel(
                "https://m.naver.com/",
                "https://m.search.naver.com/search.naver?ssc=tab.m_image.all&where=m_image&sm=mtb_jum&query=%EC%9D%8C%EC%8B%9D#imgId=image_sas%3Ablog_44c75142939b2ff73eac17fbf01c1906",
                "SK하이닉스"

            )
        );

        // 메인 list인 RVview를 가져옴.
        val recyclerview = findViewById<RecyclerView>(R.id.rv);
        // Adapter에 items 부어줌.
        val rvAdapter = RecyclerViewAdapter(items);
        // 연결
        recyclerview.adapter = rvAdapter;

        // recyclerview.layoutManager = LinearLayoutManager(this);
        recyclerview.layoutManager = GridLayoutManager(this, 2);
    }
}