package com.nil.animations.CardViewUI

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nil.animations.R
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_card_view.*
import kotlinx.android.synthetic.main.custom_card_layout.view.*

class CardView : AppCompatActivity() {

    val adapter = GroupAdapter<ViewHolder>()

    var arrData = ArrayList<dataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_view)

        arrData.add(dataModel(R.drawable.ball,"Cricket World Cup"))
        arrData.add(dataModel(R.drawable.ball1 ,"Cricket World Cup"))
        arrData.add(dataModel(R.drawable.ball4 ,"Cricket World Cup"))
        arrData.add(dataModel(R.drawable.ball3 ,"Cricket World Cup"))

        setRecyclerView()


    }

    private fun setRecyclerView() {

        for (i in 0..arrData.size-1) {
            adapter.add(dataClass(arrData.get(i)))
        }

        rvList.adapter = adapter

    }


    inner class dataClass(var data: dataModel) : Item<ViewHolder>() {
        override fun getLayout(): Int {
            return R.layout.custom_card_layout
        }

        override fun bind(viewHolder: ViewHolder, position: Int) {

            viewHolder.itemView.tvStatus.text = data.status
            viewHolder.itemView.ivImage.setImageResource(data.imageName)

        }
    }
}