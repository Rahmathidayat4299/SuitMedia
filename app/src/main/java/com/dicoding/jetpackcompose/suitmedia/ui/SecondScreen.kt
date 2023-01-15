package com.dicoding.jetpackcompose.suitmedia.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.jetpackcompose.suitmedia.R
import com.dicoding.jetpackcompose.suitmedia.databinding.ActivitySecondScreenBinding

class SecondScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySecondScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val getName = intent.getStringExtra("EXTRA_MESSAGE")
        val textview = binding.name.apply {
            text = getName
        }
        binding.btnChooseuser.setOnClickListener {
            Intent(this,MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}