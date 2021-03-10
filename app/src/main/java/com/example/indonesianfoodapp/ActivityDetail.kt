package com.example.indonesianfoodapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvDataName: TextView = findViewById(R.id.food_name)
        val tvDataDetail: TextView = findViewById(R.id.food_detail)
        val ivDataImage: ImageView = findViewById(R.id.img_detail_photo)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        val bundle = intent.extras
        if (bundle != null) {
            val image = bundle.getInt(EXTRA_IMAGE)
            ivDataImage.setImageResource(image)
        }
        tvDataName.text = name
        tvDataDetail.text = detail

    }

    companion object {
        const val EXTRA_NAME = "nama"
        const val EXTRA_DETAIL = "deskripsi"
        const val EXTRA_IMAGE = "Extra Image"

    }
}