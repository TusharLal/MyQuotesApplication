package com.example.myquotesapplication.presentation.screens.home_screen.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TodayQuoteCard() {
    QuoteCard(
        color = Color.Red,
        textColor = Color.White
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TodayQuoteCard()
}