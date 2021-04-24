package com.example.kotlinjetpackrecipeapp.dmain.util

interface DomainMapper<T, DomainModel> {
    fun mapFromEntity(model: T) : DomainModel
}