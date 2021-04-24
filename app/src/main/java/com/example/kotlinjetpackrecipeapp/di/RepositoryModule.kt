package com.example.kotlinjetpackrecipeapp.di

import com.example.kotlinjetpackrecipeapp.network.RecipeService
import com.example.kotlinjetpackrecipeapp.network.model.RecipeDtoMapper
import com.example.kotlinjetpackrecipeapp.repository.RecipeRepository
import com.example.kotlinjetpackrecipeapp.repository.RecipeRepository_Impl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Singleton
    @Provides
    fun provideRecipeRepository(
        recipeService : RecipeService,
        recipeDtoMapper: RecipeDtoMapper
    ) : RecipeRepository{
        return RecipeRepository_Impl(recipeService, recipeDtoMapper);
    }
}