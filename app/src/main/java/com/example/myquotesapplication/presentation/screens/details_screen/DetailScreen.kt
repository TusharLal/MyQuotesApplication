package com.example.myquotesapplication.presentation.screens.details_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.myquotesapplication.presentation.components.ToolBarComponent
import com.example.myquotesapplication.presentation.screens.details_screen.components.DetailQuote

@Composable
fun DetailsScreen(
    onBackPress: () -> Unit,
) {
    Scaffold(
        topBar = {
            ToolBarComponent(
                showBackIcon = true,
                title = "Details",
                onBackPressed = onBackPress
            )
        },
        modifier = Modifier.fillMaxWidth()
    ) { paddingValues ->
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .background(color = Color.LightGray)
        ) {
            DetailQuote()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun DetailsScreenPreview() {
    DetailsScreen {}
}