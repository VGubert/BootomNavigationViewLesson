package com.example.bottomnavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottomnavigationview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.item1 ->{}
                R.id.item2 ->{}
                R.id.item3 ->{}
                R.id.item4 ->{}
            }
            true
        }
    }
}