package com.example.indonesianfoodapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DeveloperActivity: AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_EMAIL = "extra_email"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_developer_info)

        val tvDataNama: TextView = findViewById(R.id.tv_data_nama)
        val tvDataEmail: TextView = findViewById(R.id.tv_data_email)

        val name = intent.getStringExtra(EXTRA_NAME)
        val email = intent.getStringExtra(EXTRA_EMAIL)
        val textnama = " $name"
        val textemail = "$email"
        tvDataNama.text = textnama
        tvDataEmail.text = textemail
    }
}

