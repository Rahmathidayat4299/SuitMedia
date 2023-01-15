package com.dicoding.jetpackcompose.suitmedia.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.jetpackcompose.suitmedia.Adapter
import com.dicoding.jetpackcompose.suitmedia.model.ListUser
import com.dicoding.jetpackcompose.suitmedia.databinding.ActivityMainBinding
import com.dicoding.jetpackcompose.suitmedia.remote.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val recycler = binding.rcvUser
        val retrofit = Retrofit.Builder().baseUrl(ApiService.BASE_URL).addConverterFactory(
            GsonConverterFactory.create()
        ).build()
        val service = retrofit.create(ApiService::class.java)
        service.getList().also { it ->
            it.enqueue(object : Callback<ListUser> {
                override fun onResponse(call: Call<ListUser>, response: Response<ListUser>) {
                    response.body()?.data.also {
                        recycler.adapter = Adapter(this@MainActivity, it!!)
                        showData()
                    }
                }

                override fun onFailure(call: Call<ListUser>, t: Throwable) {
                    Toast.makeText(this@MainActivity, t.message, Toast.LENGTH_SHORT).show()
                }

            })
        }
    }
    private fun showData() {
        binding.rcvUser.apply {
            adapter = adapter
            layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
        }
    }




}