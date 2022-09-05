package com.willyramad.chaptertiga.ViewPager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager.widget.ViewPager
import com.willyramad.chaptertiga.R
import kotlinx.android.synthetic.main.activity_view_pager.*
import kotlinx.android.synthetic.main.activity_view_pager.view.*

class ViewPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        viewPager.adapter = PageAdapter(supportFragmentManager)

        val tableLayout = findViewById<TableLayout>(R.id.tabLayout)
        tableLayout.viewPager
    }
}