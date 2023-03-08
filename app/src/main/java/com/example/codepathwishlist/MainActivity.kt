package com.example.codepathwishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wishList : MutableList<WishItem> = ArrayList()

        val wishRv = findViewById<RecyclerView>(R.id.wishListRv)
        val adapter = WishAdapter(wishList)
        wishRv.adapter = adapter
        wishRv.layoutManager = LinearLayoutManager(this)


        findViewById<Button>(R.id.button).setOnClickListener{
            wishList.add(WishItem(
                findViewById<EditText>(R.id.item_name).text.toString(),
                findViewById<EditText>(R.id.item_price).text.toString(),
                findViewById<EditText>(R.id.item_desc).text.toString()
            ))

            adapter.notifyDataSetChanged()

        }

    }
}