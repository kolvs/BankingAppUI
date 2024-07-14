package com.example.bankingappui.data

import androidx.compose.ui.graphics.vector.ImageVector

data class Currency(
    val icon: ImageVector,
    val name: String,
    val buy: Double,
    val sell: Double
)