package com.nil.animations

import android.annotation.SuppressLint
import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_web_view_map_screen.*

class WebViewMapScreen : AppCompatActivity() {

    lateinit var progressDialog: ProgressDialog


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_map_screen)


        initView()

        Handler().postDelayed({
            progressDialog.dismiss()
        }, 2000)
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun initView() {

        progressDialog = ProgressDialog(this@WebViewMapScreen)
        progressDialog.setMessage("Wait a Sec....Loading")
        progressDialog.setCancelable(false)
        progressDialog.show()

        mapView.settings.javaScriptEnabled = true
        mapView.loadUrl(
            "https://www.google.com/maps"
        )
    }
}