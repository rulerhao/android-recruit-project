package `in`.hahow.android_recruit_project.view

import `in`.hahow.android_recruit_project.model.courses.data.Data
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun Card(
    data: Data
) {

    val paddingSize: Dp = 8.dp

    Row(
        modifier = Modifier.height(IntrinsicSize.Min) // Same height for all items.
    ) {
        ThumbnailWithState(
            modifier = Modifier,
            url = data.coverImageUrl,
            data = data,
            paddingSize = paddingSize
        )
        Content(
            paddingSize = paddingSize,
            data = data
        )
    }
}