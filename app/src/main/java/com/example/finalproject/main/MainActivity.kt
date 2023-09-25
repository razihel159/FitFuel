package com.example.finalproject.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finalproject.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    // Handle home item
                }
                R.id.profile -> {
                    // Handle profile item
                }
                R.id.settings -> {
                    // Handle settings item
                }
            }
            true
        }

        private fun replaceFragment(fragment: Fragment) {
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_layout, fragment)
            fragmentTransaction.commit()
        }

    }
}