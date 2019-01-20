package com.thesimplycoder.simpletablayout.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.thesimplycoder.simpletablayout.R
import com.thesimplycoder.simpletablayout.adapter.TabPagerAdapter
import com.thesimplycoder.simpletablayout.fragment.TabFragment
import kotlinx.android.synthetic.main.activity_scrollable_tab.*

class ScrollableTabActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrollable_tab)

        setTitle("Scrollable Tab")
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // init ViewPager
        initViewPager()

        // set ViewPager into TabLayout
        tabLayout.setupWithViewPager(viewPager)
    }

    private fun initViewPager() {
        // init the adapter
        val adapter = TabPagerAdapter(supportFragmentManager)

        // init the fragments
        adapter.addFragment(TabFragment(), "Fantasy")
        adapter.addFragment(TabFragment(), "Romance")
        adapter.addFragment(TabFragment(), "Sci-fi")
        adapter.addFragment(TabFragment(), "Horror")
        adapter.addFragment(TabFragment(), "Action")
        adapter.addFragment(TabFragment(), "Comedy")
        adapter.addFragment(TabFragment(), "Drama")
        adapter.addFragment(TabFragment(), "Western")
        adapter.addFragment(TabFragment(), "TV Series")

        // set adapter to ViewPager
        viewPager.adapter = adapter
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }
}
