package com.thesimplycoder.simpletablayout.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.thesimplycoder.simpletablayout.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvFixedTab.setOnClickListener {
            startActivity(Intent(this, FixedTabActivity::class.java))
        }

        tvFixedCenteredTab.setOnClickListener {
            startActivity(Intent(this, FixedCenteredTabActivity::class.java))
        }

        tvScrollableTab.setOnClickListener {
            startActivity(Intent(this, ScrollableTabActivity::class.java))
        }

        tvIconTextTab.setOnClickListener {
            startActivity(Intent(this, IconTextTabActivity::class.java))
        }

        tvPagerTabStrip.setOnClickListener {
            startActivity(Intent(this, PagerStripActivity::class.java))
        }
    }
}
