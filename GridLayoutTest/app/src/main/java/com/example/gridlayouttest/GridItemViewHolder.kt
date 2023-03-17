package com.example.gridlayouttest

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class GridItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var iv_item: ImageView

    init {
        iv_item = itemView.findViewById(R.id.iv_item)
    }

    fun onBind(data: GridItem) {
        iv_item.setImageResource(data.img)
    }
}