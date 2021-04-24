package com.example.kotlinjetpackrecipeapp.dmain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Recipe(
    val id: Int? = null,
    val title: String? = null,
    val publisher: String? = null,
    val featuredImage: String? = null,
    val rating: Int? = null,
    val sourceUrl: String? = null,
    val description: String? = null,
    val cookingInstruction: String? = null,
    val ingredients: List<String>? = null,
    val dateAdded: String? = null,
    val dateUpdated: String? = null
) :Parcelable
