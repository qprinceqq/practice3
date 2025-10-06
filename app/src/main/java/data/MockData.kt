package com.example.practice3.data

import com.example.practice3.R
import com.example.practice3.model.Movie

object MockData {
    val movies = listOf(
        Movie(
            id = 1,
            title = "Inception",
            year = 2010,
            rating = 8.8,
            description = "A thief who steals corporate secrets...",
            imageRes = R.drawable.inception
        ),
        Movie(
            id = 2,
            title = "Interstellar",
            year = 2014,
            rating = 8.6,
            description = "A team of explorers travel through a wormhole...",
            imageRes = R.drawable.interstellar
        ),
    )
}
