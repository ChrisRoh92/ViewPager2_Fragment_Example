package com.example.viewpager2_example_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViewPager2WithFragments()
    }

    private fun initViewPager2WithFragments()
    {
        var viewPager2:ViewPager2 = findViewById(R.id.viewpager)
        var adapter = ExampleStateAdapter(supportFragmentManager,lifecycle)
        viewPager2.adapter = adapter

        // If you want to scroll the ViewPager Vertical uncomment the next line:
        // viewPager2.orientation = ViewPager2.ORIENTATION_VERTICAL

        var tablayout:TabLayout = findViewById(R.id.tablayout)
        var names:Array<String> = arrayOf("Fragment A","Fragment B","Fragment C","Fragment D")
        TabLayoutMediator(tablayout,viewPager2){tab, position ->
            tab.text = names[position]
        }.attach()

    }
}
