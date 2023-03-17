package com.example.gridlayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var gridadapter: GridItemAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gridinit()
        getItem()

    }
    private fun gridinit() {
        val recyclerView = findViewById<RecyclerView>(R.id.rv_list)

        gridadapter = GridItemAdapter()
        recyclerView?.adapter = gridadapter
        recyclerView?.run {
            val spanCount = 2
            val space = 20
            addItemDecoration(GridSpaceItemDecoration(spanCount, space))
        }
    }
    private fun getItem() {
        var data = GridItem(R.drawable.img1)
        gridadapter?.addItem(data)
        data = GridItem(R.drawable.img2)
        gridadapter?.addItem(data)
        data = GridItem(R.drawable.img3)
        gridadapter?.addItem(data)
        data = GridItem(R.drawable.img4)
        gridadapter?.addItem(data)
        data = GridItem(R.drawable.img1)
        gridadapter?.addItem(data)
        data = GridItem(R.drawable.img2)
        gridadapter?.addItem(data)
        data = GridItem(R.drawable.img3)
        gridadapter?.addItem(data)
        data = GridItem(R.drawable.img4)
        gridadapter?.addItem(data)
    }
}