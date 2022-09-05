package com.willyramad.chaptertiga.topicdua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.willyramad.chaptertiga.R
import kotlinx.android.synthetic.main.activity_explicit.*

class ExplicitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit)

    ambildata()
    //ambildataBundle()
    }
    fun ambildata(){
        var datasatu = intent.getStringExtra("angkasatu")
        var datadua = intent.getStringExtra("angkadua")
        textdatasatu.text = datasatu
        textdatadua.text = datadua
    }

    //fun ambildataBundle(){
        //var bun = intent.extras
       // textdatasatu.setText(bun!!.getString("satu"))
       // textdatasatu.setText(bun!!.getString("dua"))
   // }
}