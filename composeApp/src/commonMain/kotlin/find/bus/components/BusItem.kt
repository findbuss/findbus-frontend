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
import com.find.bus.styles.components.ItemStyles
import com.find.bus.models.Bus

@Composable
fun BusItem(
    data: Bus,
    onClick: () -> Unit,
) {
    Row(
        modifier = ItemStyles.container.modifier,
        verticalAlignment = ItemStyles.container.verticalAlignment,
        horizontalArrangement = ItemStyles.container.horizontalArrangement
    ) {
        Box(
            modifier = ItemStyles.box.background(Color(data.routeColor))
        ) {
            Text(
                text = data.routeId,
                style = AppTheme.typography.BoldText.copy(color = Color(data.routeTextColor))
            )
        }

        Text(
            text = data.routeLongName,
            style = AppTheme.typography.BoldText,
            modifier = ItemStyles.title
        )

        Text(
            text = data.nextBus,
            color = AppTheme.colors.Highlight,
            style = AppTheme.typography.DefaultText,
            modifier = ItemStyles.title
        )

        IconButton(
            onClick = { onClick },
            modifier = ItemStyles.iconButton
        ) {
            Icon(
                imageVector = if (data.saved) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                contentDescription = "Save Route",
                tint = if (data.saved) AppTheme.colors.Highlight else AppTheme.colors.SecondaryText,
                modifier = ItemStyle.icon
            )
        }
    }
}

@Preview
@Composable
fun PreviewBusItem() {
    BusItem(
        data = BusData(
            routeId = "101",
            routeColor = "#61BB46",
            routeTextColor = "#FFFFFF",
            routeLongName = "Central Station - Downtown",
            nextBus = "5 min"
        ),
        onClick = {}
    )
}
