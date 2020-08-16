package com.nil.animations

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.RelativeLayout
import android.widget.RelativeLayout.CENTER_IN_PARENT
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.add_remove_anim.*


class LayoutAddRemoveAnim : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_remove_anim)


        add.setOnClickListener {

            val params = RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
            )
            params.addRule(CENTER_IN_PARENT)
            params.setMargins(10,10,10,10)

            var cv = CardView(this)
            cv.cardElevation = 10f


            val tv_dynamic = TextView(this)
            tv_dynamic.textSize = 20f
            tv_dynamic.textAlignment = View.TEXT_ALIGNMENT_CENTER
            tv_dynamic.setTextColor(Color.parseColor("#000000"));
            tv_dynamic.setLayoutParams(params)
            tv_dynamic.setGravity(Gravity.CENTER_HORIZONTAL)
            tv_dynamic.text = "Layout Animation text "

            cv.addView(tv_dynamic)

            container.addView(cv,0)

        }


        remove.setOnClickListener{
            container.removeViewAt(0)
        }

    }
}
