package com.example.kotlinjetpackrecipeapp.network.model

import com.example.kotlinjetpackrecipeapp.dmain.model.Recipe
import com.example.kotlinjetpackrecipeapp.dmain.util.DomainMapper

class RecipeDtoMapper: DomainMapper<RecipeDto, Recipe> {
    override fun mapFromEntity(model: RecipeDto): Recipe {
        return Recipe(
            id = model.pk,
            title = model.title,
            publisher = model.publisher,
            featuredImage =  model.featuredImage,
            rating = model.rating,
            sourceUrl = model.sourceUrl,
            description = model.description,
            cookingInstruction = model.cookingInstruction,
            ingredients = model.ingredients,
            dateAdded = model.dateAdded,
            dateUpdated = model.dateUpdated
        )
    }

    fun mapFromEntityList(entityList: List<RecipeDto>) : List<Recipe> {
        return entityList.map { mapFromEntity(it) }
    }
}