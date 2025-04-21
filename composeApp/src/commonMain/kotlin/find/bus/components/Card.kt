package com.find.bus.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.find.bus.styles.components.CardStyles

@Composable
fun Card(
    title: String? = null,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(modifier = CardStyles.container) {
        if (!title.isNullOrEmpty()) {
            Text(
                text = title,
                style = CardStyles.titleText,
                modifier = CardStyles.titlePadding
            )
        }
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .then(CardStyles.contentPadding),
            content = content
        )
    }
}
