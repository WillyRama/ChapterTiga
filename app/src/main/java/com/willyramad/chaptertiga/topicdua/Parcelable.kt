package com.willyramad.chaptertiga.topicdua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.willyramad.chaptertiga.R
import kotlinx.android.synthetic.main.activity_parcelable.*

class Parcelable : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcelable)

        var dataperson = intent.getParcelableExtra("dataperson") as PersonParcelable?
        textperson.text = dataperson!!.umur.toString()
    }
}