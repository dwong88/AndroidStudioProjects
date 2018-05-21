package com.myandroid.davidwong.slide

import android.support.v4.view.ViewPager
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.myandroid.davidwong.slide.R.id.viewpager

class MainActivity : AppCompatActivity() {


    private val viewPager: ViewPager? = null;
    private lateinit var slideAdapter: SlideAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)

        slideAdapter = SlideAdapter(applicationContext)
        viewpager.adapter = slideAdapter
    }
}
