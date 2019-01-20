package com.thesimplycoder.simpletablayout.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.thesimplycoder.simpletablayout.R
import com.thesimplycoder.simpletablayout.adapter.TabPagerAdapter
import com.thesimplycoder.simpletablayout.fragment.TabFragment
import kotlinx.android.synthetic.main.activity_fixed_tab.*

class FixedTabActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fixed_tab)

        setTitle("Fixed Tab")
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
        adapter.addFragment(TabFragment(), "Contact")
        adapter.addFragment(TabFragment(), "Phone")
        adapter.addFragment(TabFragment(), "Message")

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
