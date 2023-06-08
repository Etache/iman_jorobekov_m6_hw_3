package com.example.m6_hw_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.m6_hw_3.adapter.CountAdapter
import com.example.m6_hw_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var adapter: CountAdapter? = null
    val viewModel by lazy { MainViewModel() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = CountAdapter(this, viewModel)
        binding.vpMain.adapter = adapter
    }
}