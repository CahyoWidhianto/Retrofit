package com.example.praktikumretrofit.api

import com.example.praktikumretrofit.Model.ResponseData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("users")
    fun getListUsers(@Query("page") page:String): Call<ResponseData>
}