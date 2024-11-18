package com.example.japanese_culture_quiz

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") { 
            HomeScreen(navController) 
        }
        composable("next_screen") { 
            NextScreen() 
        }
    }
}
