package com.muhammaduzaer.plantitall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muhammaduzaer.plantitall.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        initialize()
    }

    private fun initialize() {
        binding.textView.setOnClickListener {
//            throw RuntimeException("Test Crash") // Force a crash
        }
    }
}