package com.yuhaengga.ad_compose_ui_practice.features.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.yuhaengga.ad_compose_ui_practice.ui.theme.Ad_compose_ui_practiceTheme

val image =
    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR7VFUAI3Y9JDz47pLh0FUPJOvExSU572mhLNzVzxtjPA&s=10"

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier
            .fillMaxSize(),
        containerColor = MaterialTheme.colorScheme.onPrimary,
        topBar = { HomeScreenTopBar(userName = "김원혁", profileImage = image) }
    ) { innerPadding ->
        HomeScreenContent(
            innerPadding = innerPadding
        )
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun HomeScreenPreview() {
    Ad_compose_ui_practiceTheme(
    ) {
        HomeScreen()
    }
}
