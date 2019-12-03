package com.example.mysamplekot

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.flowers_list_item.view.*

class MyAdapter (val items : ArrayList<String>, val context: MainActivity): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.flowers_list_item, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder?.flower?.text = items.get(position)
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val flower = itemView.flower_type
    }
}