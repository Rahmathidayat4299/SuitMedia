package com.dicoding.jetpackcompose.suitmedia.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.jetpackcompose.suitmedia.R
import com.dicoding.jetpackcompose.suitmedia.databinding.ActivityFirstScreenBinding


class FirstScreen : AppCompatActivity() {
    private lateinit var binding: ActivityFirstScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}