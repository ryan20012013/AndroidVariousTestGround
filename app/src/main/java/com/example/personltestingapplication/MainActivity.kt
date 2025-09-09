package com.example.personltestingapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.personltestingapplication.adapter.ClipChildrenAdapter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.layout_main_activity_root)
        val rv: RecyclerView = findViewById<RecyclerView>(R.id.item_list)
        val gridLayoutManager = GridLayoutManager(this, 2)

        // Optional: explicitly set all items to span size 1
        gridLayoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                return 1 // every item takes 1 span
            }
        }

        rv.layoutManager = gridLayoutManager
        rv.adapter = ClipChildrenAdapter()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}