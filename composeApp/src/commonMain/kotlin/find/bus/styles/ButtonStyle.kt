package com.find.bus.styles

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import com.find.bus.styles.theme.AppTheme

object ButtonStyles {
    fun buttonStyle(variant: ButtonVariant): androidx.compose.ui.Modifier {
        return when (variant) {
            ButtonVariant.Primary -> {
                androidx.compose.ui.Modifier.background(AppTheme.colors.Highlight)
            }
            ButtonVariant.Secondary -> {
                androidx.compose.ui.Modifier.background(AppTheme.colors.TertiaryBackground)
            }
            ButtonVariant.Negative -> {
                androidx.compose.ui.Modifier.background(AppTheme.colors.NegativeColor)
            }
        }
    }

    fun textStyle(variant: ButtonVariant): TextStyle {
        return when (variant) {
            ButtonVariant.Primary -> {
                TextStyle(
                    color = AppTheme.colors.SecondaryBackground,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            ButtonVariant.Secondary -> {
                TextStyle(
                    color = AppTheme.colors.PrimaryText,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            ButtonVariant.Negative -> {
                TextStyle(
                    color = AppTheme.colors.SecondaryBackground,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

enum class ButtonVariant {
    Primary,
    Secondary,
    Negative
}
