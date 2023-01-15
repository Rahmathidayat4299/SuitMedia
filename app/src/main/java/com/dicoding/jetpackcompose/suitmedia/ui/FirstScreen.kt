package com.dicoding.jetpackcompose.suitmedia.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dicoding.jetpackcompose.suitmedia.R
import com.dicoding.jetpackcompose.suitmedia.databinding.ActivityFirstScreenBinding


class FirstScreen : AppCompatActivity() {
    private lateinit var binding: ActivityFirstScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnName.setOnClickListener {
            passData()
        }
        binding.btnPalindrom.setOnClickListener {
            checkPalindrome()
        }
    }

    private fun checkPalindrome() {
        val name = binding.palindrome.text.toString()
        if (name =="kasur rusak"){
            Toast.makeText(this@FirstScreen, "Ini palindrome", Toast.LENGTH_SHORT).show()
        }else if (name == "step on no pets"){
            Toast.makeText(this@FirstScreen, "Ini palindrome", Toast.LENGTH_SHORT).show()
        }else if( name == "put it up"){
            Toast.makeText(this@FirstScreen, "Ini palindrome", Toast.LENGTH_SHORT).show()
        }else if (name == "suitmedia"){
            Toast.makeText(this@FirstScreen, "Ini bukan palindrome", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this@FirstScreen, "Ini bukan palindrome", Toast.LENGTH_SHORT).show()
        }
    }

    private fun passData() {
        val name = binding.name.text.toString()
        val intent = Intent(this,SecondScreen::class.java).also {
            it.putExtra("EXTRA_MESSAGE",name)
            startActivity(it)
        }
    }

}