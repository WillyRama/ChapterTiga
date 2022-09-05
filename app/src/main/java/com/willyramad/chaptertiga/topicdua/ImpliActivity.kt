package com.willyramad.chaptertiga.topicdua

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import com.willyramad.chaptertiga.R
import kotlinx.android.synthetic.main.activity_impli.*

class ImpliActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_impli)

        //gaelri
        btngaleri.setOnClickListener{
            val pindah = Intent(Intent.ACTION_VIEW)
            pindah.data = Uri.parse("content://media/external/images/media/")
            startActivity(pindah)
        }
        //camera
        buttonkamera.setOnClickListener {
            val kamera = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(kamera)
        }
        buttonweb.setOnClickListener {
            val pindah = Intent(Intent.ACTION_VIEW)
            pindah.data = Uri.parse("http://www.binary-academy.com/")
            startActivity(pindah)
        }
    }
}