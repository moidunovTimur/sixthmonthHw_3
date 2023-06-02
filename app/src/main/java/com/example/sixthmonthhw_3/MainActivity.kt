package com.example.sixthmonthhw_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sixthmonthhw_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = Adapter(this)
        binding.vpCount.adapter = adapter
    }
}