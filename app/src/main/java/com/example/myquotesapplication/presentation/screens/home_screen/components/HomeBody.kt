package com.example.myquotesapplication.presentation.screens.home_screen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeBody(
    onItemClick: () -> Unit,
) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item {
            HeadingTitle(title = "Today's Quote")
            TodayQuoteCard()
            HeadingTitle(title = "Quote")
        }
        items(20) {
            QuoteCard(
                modifier = Modifier.clickable { onItemClick() }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeBodyPreview() {
    HomeBody {}
}