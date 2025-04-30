package com.example.projek_pertama.network

import com.example.projek_pertama.model.Product
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("products")
    fun getProduct(): Call<List<Product>>
}