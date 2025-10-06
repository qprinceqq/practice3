package com.example.practice3.ui.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.practice3.model.Movie

@Composable
fun MovieListScreen(movies: List<Movie>, onMovieClick: (Int) -> Unit) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(8.dp)
    ) {
        items(movies) { movie ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
                    .clickable { onMovieClick(movie.id) }
            ) {
                Row(modifier = Modifier.padding(8.dp)) {
                    //Image(
                    //    painter = rememberAsyncImagePainter(movie.imageUrl),
                    //    contentDescription = movie.title,
                    //    modifier = Modifier.size(80.dp)
                    //)
                    Image(
                        painter = painterResource(movie.imageRes),
                        contentDescription = movie.title,
                        modifier = Modifier.size(80.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        Text(text = movie.title)
                        Text(text = "Year: ${movie.year}")
                        Text(text = "Rating: ${movie.rating}")
                    }
                }
            }
        }
    }
}
