package com.example.myquotesapplication.presentation.screens.details_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailQuote() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .background(color = Color.White)
            .padding(horizontal = 10.dp)
    ) {
        Text(
            text = "Detail Quote",
            color = Color.Black,
            textAlign = TextAlign.Justify,
            fontSize = 16.sp,
            fontWeight = FontWeight.W600,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Text(
            text = "Author Name",
            color = Color.Black,
            textAlign = TextAlign .End,
            fontSize = 12.sp,
            fontWeight = FontWeight.W400,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DetailQuotePreview() {
    DetailQuote()
}