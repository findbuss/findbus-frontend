package com.find.bus.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.TextStyle
import com.find.bus.styles.ButtonStyles
import com.find.bus.styles.ButtonVariant
import com.find.bus.styles.theme.AppTheme

@Composable
fun CustomButton(
    text: String,
    variant: ButtonVariant = ButtonVariant.Primary,
    onClick: () -> Unit
) {
    val buttonModifier = ButtonStyles.buttonStyle(variant)
    val textStyle = ButtonStyles.textStyle(variant)

    Box(
        modifier = buttonModifier
            .fillMaxWidth()
            .padding(12.dp)
            .clip(RoundedCornerShape(12.dp))
            .clickable { onClick() }
            .padding(12.dp)
    ) {
        Text(
            text = text,
            style = textStyle
        )
    }
}

@Preview
@Composable
fun PreviewCustomButton() {
    CustomButton(
        text = "Clique Aqui",
        variant = ButtonVariant.Primary,
        onClick = {}
    )
}
