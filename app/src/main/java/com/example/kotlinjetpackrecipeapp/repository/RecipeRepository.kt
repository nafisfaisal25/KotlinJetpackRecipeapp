package com.example.kotlinjetpackrecipeapp.repository

import com.example.kotlinjetpackrecipeapp.dmain.model.Recipe

interface RecipeRepository {
    suspend fun search(token: String, page: Int, query: String): List<Recipe>
    suspend fun get(token: String, id: Int) : Recipe
}