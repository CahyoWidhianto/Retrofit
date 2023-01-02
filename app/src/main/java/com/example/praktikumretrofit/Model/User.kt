package com.example.praktikumretrofit.Model

import com.google.gson.annotations.SerializedName

data class User(
    @field:SerializedName("id")
    val id: Int?,
    @field:SerializedName("email")
    val email: String?,
    @field:SerializedName("first_name")
    val firstName: String?,
    @field:SerializedName("last_name")
    val lastName: String?,
    @field:SerializedName("avatar")
    val avatar: String?
)
