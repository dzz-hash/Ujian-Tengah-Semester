package com.example.uts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class AdapterList(private val itemList: List<ItemList>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        private const val VIEW_TYPE_HEADER = 0
        private const val VIEW_TYPE_ITEM = 1
    }

    override fun getItemCount(): Int = itemList.size + 1 // +1 untuk header

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) VIEW_TYPE_HEADER else VIEW_TYPE_ITEM
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == VIEW_TYPE_HEADER) {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_header, parent, false)
            HeaderViewHolder(view)
        } else {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_data, parent, false)
            ItemViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ItemViewHolder && position > 0) {
            val item = itemList[position - 1] // kurangi 1 karena index 0 adalah header
            holder.bind(item)
        }
    }

    class HeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val instagram: TextView = itemView.findViewById(R.id.tv_Instagram)
        private val imageView: ImageView = itemView.findViewById(R.id.item_image)
        private val judul: TextView = itemView.findViewById(R.id.title)
        private val subJudul: TextView = itemView.findViewById(R.id.sub_title)

        fun bind(item: ItemList) {
            judul.text = item.Judul
            subJudul.text = item.Subjudul
            Glide.with(imageView.context).load(item.Image).into(imageView)
            instagram.text = item.InstagramUrl
        }
    }
}
