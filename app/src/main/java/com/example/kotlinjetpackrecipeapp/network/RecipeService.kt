package com.example.kotlinjetpackrecipeapp.network

import com.example.kotlinjetpackrecipeapp.network.model.RecipeDto
import com.example.kotlinjetpackrecipeapp.network.responses.RecipeSearchResponses
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface RecipeService {
    @GET("search")
    suspend fun search(
        @Header("Authorization") token: String,
        @Query("page") page: Int,
        @Query("query") query: String
    ): RecipeSearchResponses

    @GET("get")
    suspend fun get(
        @Header("Authorization") token: String,
        @Query("id") id: Int
    ): RecipeDto
}