package me.kasikaruppiah.miwok

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = SimpleFragmentPageAdapter(this, supportFragmentManager)
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}
