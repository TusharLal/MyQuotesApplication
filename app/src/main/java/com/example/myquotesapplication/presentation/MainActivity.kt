package com.example.myquotesapplication.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.myquotesapplication.presentation.navigation.AppNavController
import com.example.myquotesapplication.presentation.ui.theme.MyQuotesApplicationTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyQuotesApplicationTheme {
                val navController = rememberNavController()
                AppNavController(navController)
            }
        }
    }
}