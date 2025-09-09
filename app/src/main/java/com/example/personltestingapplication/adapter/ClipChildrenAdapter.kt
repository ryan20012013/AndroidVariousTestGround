package com.example.personltestingapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewOutlineProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.personltestingapplication.R

class ClipChildrenAdapter : RecyclerView.Adapter<ClipChildrenAdapter.ClipChildrenViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ClipChildrenViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_clip_children_test, null, false)
        val targetView = view.findViewById<ViewGroup>(R.id.item_view)
        targetView.outlineProvider = ViewOutlineProvider.BACKGROUND
        targetView.clipChildren = true
        targetView.clipToOutline = true

        return ClipChildrenViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ClipChildrenViewHolder,
        position: Int
    ) {
    }

    override fun getItemCount(): Int {
        return 50
    }


    public class ClipChildrenViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}