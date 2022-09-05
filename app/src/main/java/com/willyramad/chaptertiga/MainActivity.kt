package com.willyramad.chaptertiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var btnklik3 : Button
        lateinit var hasilhasil2 : TextView

        var btnklik = findViewById(R.id.btn1) as Button
        var hasil = findViewById(R.id.hellohasil) as TextView
        btnklik3 =  findViewById(R.id.klikbtn3)

        btnklik.setOnClickListener{
            hasil.text = "hallo, terima kasih sudah klik btn 1"
        }
    }
}