package com.dicoding.jetpackcompose.suitmedia

import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by Rahmat Hidayat on 15/01/2023.
 */
interface ApiService {
    @GET("/api/users")
    fun getList(): Call<ListUser>

    companion object{
        val BASE_URL="https://reqres.in"
    }
}