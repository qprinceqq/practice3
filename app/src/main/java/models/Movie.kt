package com.example.practice3.model

data class Movie(
    val id: Int,
    val title: String,
    val year: Int,
    val rating: Double,
    val description: String,
    //val imageUrl: String,
    val imageRes: Int
)