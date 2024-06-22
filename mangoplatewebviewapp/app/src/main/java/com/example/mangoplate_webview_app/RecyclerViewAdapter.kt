package com.example.mangoplate_webview_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(val List: MutableList<RVModel>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    // 새로운 ViewHolder 객체를 생성
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        return ViewHolder(view)
    }

    // 데이터를 ViewHolder에 바인딩
    override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder, position: Int) {
        holder.bindItems(List[position]);
    }

    // 아이템의 개수 반환
    override fun getItemCount(): Int {
        return List.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(item: RVModel) {
            val rvImage = itemView.findViewById<ImageView>(R.id.rvImageArea);
            val rvText = itemView.findViewById<TextView>(R.id.rvTextArea);

            rvText.text = item.title;
        }

    }


}