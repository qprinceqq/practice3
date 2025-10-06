package com.example.practice3.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.practice3.model.Movie

@Composable
fun MovieDetailScreen(movie: Movie) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        //Image(
        //    painter = rememberAsyncImagePainter(movie.imageUrl),
        //    contentDescription = movie.title,
        //    modifier = Modifier
        //        .fillMaxWidth()
        //        .height(250.dp)
        //)
        Image(
            painter = painterResource(movie.imageRes),
            contentDescription = movie.title,
            modifier = Modifier.size(80.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = movie.title)
        Text(text = "Year: ${movie.year}")
        Text(text = "Rating: ${movie.rating}")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = movie.description)
    }
}
