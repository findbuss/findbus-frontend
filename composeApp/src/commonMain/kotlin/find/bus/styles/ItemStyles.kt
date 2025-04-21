package com.seu.pacote.styles.theme

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
    val ItemContainer = ColumnStyle(
        modifier = Modifier
            .fillMaxWidth()
            .background(AppTheme.colors.TertiaryBackground)
            .padding(8.dp)
            .clip(RoundedCornerShape(12.dp)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    )

    val CodeBox = Modifier
        .padding(horizontal = 8.dp, vertical = 4.dp)
        .clip(RoundedCornerShape(8.dp))

    val IconButton = Modifier
        .padding(8.dp)
        .clip(CircleShape)

    val RowGap8 = Modifier
        .padding(horizontal = 0.dp)
        .wrapContentHeight()
        .then(Modifier)

    val TitleText = Modifier
        .weight(1f)

    val IconStyle = Modifier
        .size(24.dp)

}