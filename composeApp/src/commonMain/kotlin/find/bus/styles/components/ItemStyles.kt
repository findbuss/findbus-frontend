package com.find.bus.styles.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Arrangement
import com.find.bus.styles.theme.AppTheme

object ItemStyles {
    val container = ColumnStyle(
        modifier = Modifier
            .fillMaxWidth()
            .background(AppTheme.colors.TertiaryBackground)
            .padding(8.dp)
            .clip(RoundedCornerShape(12.dp)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    )

    val box = Modifier
        .padding(horizontal = 8.dp, vertical = 4.dp)
        .clip(RoundedCornerShape(8.dp))

    val iconButton = Modifier
        .padding(8.dp)
        .clip(CircleShape)

    val title = Modifier
        .weight(1f)

    val icon = Modifier
        .size(24.dp)

}