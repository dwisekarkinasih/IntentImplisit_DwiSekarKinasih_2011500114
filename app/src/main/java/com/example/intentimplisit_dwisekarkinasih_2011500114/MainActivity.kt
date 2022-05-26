package com.example.intentimplisit_dwisekarkinasih_2011500114

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.net.Uri
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnweb = findViewById<Button>(R.id.btnweb)

        btnweb.setOnClickListener {
            val link = "https://www.atmaluhur.ac.id/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(link)
            startActivity(i)
        }
    }
}