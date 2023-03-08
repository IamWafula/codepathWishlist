package com.example.codepathwishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class WishAdapter (private val all_items: List<WishItem>): RecyclerView.Adapter<WishAdapter.ViewHolder>()  {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val name : TextView
        val price : TextView
        val url : TextView

        init {
            name = itemView.findViewById(R.id.itemName)
            price = itemView.findViewById(R.id.itemValue)
            url = itemView.findViewById(R.id.itemUrl)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val wishView = inflater.inflate(R.layout.wish_item, parent, false)
        return ViewHolder(wishView)
    }

    override fun getItemCount(): Int {
        return all_items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = all_items.get(position)

        holder.name.text = currentItem.itemName
        holder.price.text = currentItem.itemPrice
        holder.url.text = currentItem.itemDesc
    }


}