package com.example.practice3.viewmodel

import androidx.lifecycle.ViewModel
import com.example.practice3.model.Movie
import com.example.practice3.data.MockData

class MovieViewModel : ViewModel() {
    val movies: List<Movie> = MockData.movies

    fun getMovieById(id: Int): Movie? {
        return movies.find { it.id == id }
    }
}
