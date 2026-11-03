package com.yuhaengga.ad_compose_ui_practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.yuhaengga.ad_compose_ui_practice.features.home.HomeScreen
import com.yuhaengga.ad_compose_ui_practice.ui.theme.Ad_compose_ui_practiceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ad_compose_ui_practiceTheme {
                HomeScreen()
            }
        }
    }
}
