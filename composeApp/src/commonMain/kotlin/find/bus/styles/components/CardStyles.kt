package com.find.bus.styles.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.find.bus.styles.theme.AppTheme

object CardStyles {
    val container = Modifier
        .fillMaxWidth()
        .padding(top = 12.dp)
        .border(
            width = 1.dp,
            color = AppTheme.colors.Border,
            shape = RoundedCornerShape(12.dp)
        )
        .background(AppTheme.colors.SecondaryBackground)
        .padding(bottom = 12.dp)

    val titleText = TextStyle(
        color = AppTheme.colors.PrimaryText,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    )

    val titlePadding = Modifier.padding(horizontal = 12.dp)

    val contentPadding = Modifier.padding(horizontal = 12.dp)
}
