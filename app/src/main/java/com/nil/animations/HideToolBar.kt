package com.nil.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class HideToolBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hide_tool_bar)

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        val recyclerView =
            findViewById<View>(R.id.my_recycler_view) as RecyclerView
        val adapter = RecyclerAdapter(dummyStrings())
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter

    }

    private fun dummyStrings(): List<String> {
        val colorList: MutableList<String> =
            ArrayList()
        colorList.add("#354045")
        colorList.add("#20995E")
        colorList.add("#76FF03")
        colorList.add("#E26D1B")
        colorList.add("#911717")
        colorList.add("#9C27B0")
        colorList.add("#20995E")
        colorList.add("#76FF03")
        colorList.add("#20995E")
        colorList.add("#76FF03")
        colorList.add("#E26D1B")
        colorList.add("#911717")
        colorList.add("#9C27B0")
        colorList.add("#20995E")
        colorList.add("#76FF03")
        colorList.add("#E26D1B")
        colorList.add("#911717")
        colorList.add("#9C27B0")
        colorList.add("#FFC107")
        colorList.add("#01579B")
        return colorList
    }
}