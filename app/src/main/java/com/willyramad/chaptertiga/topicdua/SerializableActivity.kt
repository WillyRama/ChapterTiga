package com.willyramad.chaptertiga.topicdua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.willyramad.chaptertiga.R
import kotlinx.android.synthetic.main.activity_serializable.*

class SerializableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serializable)
    }
    fun ambildataSerilizable(){
        val data = intent.getSerializableExtra("datamahasiswa") as MahasiswaSave
        textser.text = data.jurusan
    }
}