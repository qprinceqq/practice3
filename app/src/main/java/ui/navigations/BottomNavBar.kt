package com.example.practice3.ui.navigations

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem

sealed class Screen(val route: String, val icon: ImageVector, val label: String) {
    object Movies : Screen("movies", Icons.Default.Home, "Movies")
    object Favorites : Screen("favorites", Icons.Default.Favorite, "Favorites")
}

@Composable
fun BottomNavBar(selectedScreen: Screen, onScreenSelected: (Screen) -> Unit) {
    NavigationBar {
        listOf(Screen.Movies, Screen.Favorites).forEach { screen ->
            NavigationBarItem(
                icon = { Icon(screen.icon, contentDescription = screen.label) },
                label = { Text(screen.label) },
                selected = screen == selectedScreen,
                onClick = { onScreenSelected(screen) }
            )
        }
    }
}
