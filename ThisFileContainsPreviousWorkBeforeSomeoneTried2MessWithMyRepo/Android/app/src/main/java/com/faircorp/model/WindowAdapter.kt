package com.faircorp.model

import android.support.v7.widget.RecyclerView

class WindowAdapter(val listener: OnWindowSelectedListener): RecyclerView.Adapter<WindowAdapter.WindowViewHolder>() {
    // ...

    override fun onBindViewHolder(holder: WindowViewHolder, position: Int) {
        val window = items[position]
        holder.apply {
            name.text = window.name
            status.text = window.status.toString()
            room.text = window.room.name
            itemView.setOnClickListener { listener.onWindowSelected(window.id) } // (1)
        }
    }

    override fun onViewRecycled(holder: WindowViewHolder) { // (2)
        super.onViewRecycled(holder)
        holder.apply {
            itemView.setOnClickListener(null)
        }

    }
}