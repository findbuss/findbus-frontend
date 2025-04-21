package com.find.bus.styles.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

object AppTypography {
    val BoldText = TextStyle(
        color = AppColors.PrimaryText,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    )

    val DefaultText = TextStyle(
        color = AppColors.SecondaryText,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
}
