package com.example.japanese_culture_quiz

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // 背景画像
        Image(
            painter = painterResource(id = R.drawable.japanese_image),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .scale(1.1f),
        )

        // UI要素
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { 
                navController.navigate("next_screen") 
            }) {
                Text(text = "次の画面へ")
            }
        }
    }
}
