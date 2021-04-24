package com.example.kotlinjetpackrecipeapp.repository

import com.example.kotlinjetpackrecipeapp.dmain.model.Recipe
import com.example.kotlinjetpackrecipeapp.network.RecipeService
import com.example.kotlinjetpackrecipeapp.network.model.RecipeDtoMapper

class RecipeRepository_Impl(
    private val recipeService: RecipeService,
    private val mapper: RecipeDtoMapper
): RecipeRepository {
    override suspend fun search(token: String, page: Int, query: String): List<Recipe> {
        val result = recipeService.search(token, page, query).recipes
        return mapper.mapFromEntityList(result)
    }

    override suspend fun get(token: String, id: Int): Recipe {
        return mapper.mapFromEntity(recipeService.get(token, id))
    }
}