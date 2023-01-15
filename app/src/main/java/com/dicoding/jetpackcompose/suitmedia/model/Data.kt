package com.dicoding.jetpackcompose.suitmedia.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Rahmat Hidayat on 15/01/2023.
 */
data class Data(
    @SerializedName("avatar")
    val avatar: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("first_name")
    val firstName: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("last_name")
    val lastName: String
)