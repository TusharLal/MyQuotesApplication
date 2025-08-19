package com.example.myquotesapplication.presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ToolBarComponent(
    showBackIcon: Boolean = false,
    title: String = "",
    onBackPressed: () -> Unit = {},
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = title,
                fontSize = 18.sp,
                fontWeight = FontWeight.W800,
                textAlign = TextAlign.Center
            )
        },
        navigationIcon = {
            if (showBackIcon) {
                IconButton(
                    onClick = { onBackPressed() }
                ) {
                    Icon(
                        Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Back",
                        modifier = Modifier
                            .size(32.dp)
                            .padding(2.dp)
                    )
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
private fun ToolBarComponentPreview() {
    ToolBarComponent(
        showBackIcon = true,
        title = "Home"
    )
}