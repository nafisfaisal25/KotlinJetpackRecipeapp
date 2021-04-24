package com.example.kotlinjetpackrecipeapp.network.model

import com.google.gson.annotations.SerializedName

data class RecipeDto (
    @SerializedName(value = "pk")
    var pk: Int? = null,
    @SerializedName(value = "title")
    val title: String? = null,
    @SerializedName(value = "publisher")
    val publisher: String? = null,
    @SerializedName(value = "featured_image")
    val featuredImage: String? = null,
    @SerializedName(value = "rating")
    val rating: Int? = null,
    @SerializedName(value = "source_url")
    val sourceUrl: String? = null,
    @SerializedName(value = "description")
    val description: String? = null,
    @SerializedName(value = "cooking_instruction")
    val cookingInstruction: String? = null,
    @SerializedName(value = "ingredients")
    val ingredients: List<String>? = null,
    @SerializedName(value = "date_added")
    val dateAdded: String? = null,
    @SerializedName(value = "date_updated")
    val dateUpdated: String? = null
)