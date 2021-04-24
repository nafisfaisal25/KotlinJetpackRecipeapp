package com.example.kotlinjetpackrecipeapp.network.responses

import com.example.kotlinjetpackrecipeapp.network.model.RecipeDto
import com.google.gson.annotations.SerializedName

data class RecipeSearchResponses (
    @SerializedName("results")
    var recipes: List<RecipeDto>
)