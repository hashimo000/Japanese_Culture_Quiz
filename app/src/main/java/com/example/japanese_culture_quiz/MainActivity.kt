package com.example.japanese_culture_quiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.scale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BackgroundImageExample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BackgroundImageExample() // 背景画像を設定する関数をプレビューで呼び出し
}

private infix fun Unit.scale(fl: Float) {

}

@Composable
fun BackgroundImageExample() {
    // 画像を背景として設定
    Box(
        modifier = Modifier
            .fillMaxSize() // 全画面に画像を表示
    ) {
        // 背景画像
        Image(
            painter = painterResource(id = R.drawable.japanese_image), // drawableに入れた画像ファイル名
            contentDescription = null, // アクセシビリティのための説明文（不要ならnull）
            modifier = Modifier
                .fillMaxSize() // 画面全体に表示
                .scale(1.1f), // 画像を10%ズーム
        )

        // 他のUI要素を画像の上に配置
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { /* ボタンの処理 */ }) {
                Text(text = "ボタン")
            }
        }
    }
}
