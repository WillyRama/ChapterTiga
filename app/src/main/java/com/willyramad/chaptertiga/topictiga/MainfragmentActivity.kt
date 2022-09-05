package com.willyramad.chaptertiga.topictiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.willyramad.chaptertiga.R
import kotlinx.android.synthetic.main.activity_mainfragment.*

class MainfragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainfragment)

       // var fragmentSatu = FragmentSatu()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fcFragment, FragmentDua())
            commit()
        }
        btnfr1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fcFragment, FragmentSatu())
                commit()
            }
        }
        btnfr2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fcFragment,FragmentDua())
                commit()
            }
        }
        btnfr3.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fcFragment, FragmentTiga())
                commit()
            }
        }
    }
}