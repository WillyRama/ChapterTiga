package com.willyramad.chaptertiga.btnnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.willyramad.chaptertiga.R
import kotlinx.android.synthetic.main.activity_button_navigation.*

class ButtonNavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_navigation)

        bottonnav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frnav, FragmentHome())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.chat ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frnav, ChatFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.promo ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frnav, PromoFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.profil ->{
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frnav, ProfilFragment())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
    }
}