package com.example.recyclerview_16

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val context: Context, val members: ArrayList<Member>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        if (holder is CustomViewHolder) {
            if (position % 3 == 0) {
                holder.itemImage.setImageResource(R.drawable.catten)
            } else if (position % 4 == 0) {
                holder.itemImage.setImageResource(R.drawable.oy)
            } else if (position % 5 == 0) {
                holder.itemImage.setImageResource(R.drawable.panda)
            } else {
                holder.itemImage.setImageResource(R.drawable.yash)
            }
        }
    }

    override fun getItemCount(): Int {
        return members.size
    }

    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemImage: ImageView = view.findViewById(R.id.item_image)
    }
}