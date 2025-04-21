package find.bus.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.find.bus.styles.theme.AppTheme
import com.find.bus.styles.components.ItemStyles.*
import com.find.bus.models.Stop

@Composable
fun StopItem(
    data: Stop,
    onClick: () -> Unit,
) {
    Row(
        modifier = ItemContainer.modifier,
        verticalAlignment = ItemContainer.verticalAlignment,
        horizontalArrangement = ItemContainer.horizontalArrangement
    ) {
        Box(
            modifier = CodeBox.background(Color(data.routeColor))
        ) {
            Text(
                text = data.stopId,
                style = AppTheme.typography.BoldText.copy(color = Color(data.stopTextColor))
            )
        }

        Text(
            text = data.stopLongName,
            style = AppTheme.typography.BoldText,
            modifier = Modifier.TitleText
        )

        IconButton(
            onClick = { onClick },
            modifier = IconButton
        ) {
            Icon(
                imageVector = if (data.saved) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                contentDescription = "Save Stop",
                tint = if (data.saved) AppTheme.colors.Highlight else AppTheme.colors.SecondaryText,
                modifier = IconStyle
            )
        }
    }
}

@Preview
@Composable
fun PreviewStopItem() {
    StopItem(
        data = Stop(
            stopId = "1",
            stopColor = "#61BB46",
            stopTextColor = "#FFFFFF",
            stopLongName = "Main Street - Central Park"
        ),
        onClick = {}
    )
}
