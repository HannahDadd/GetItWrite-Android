package com.example.getitwrite.views.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun errorText(error: MutableState<String>) {
    Text(error.value, color = Color.Red)
}