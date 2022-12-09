package `in`.hahow.android_recruit_project.view

import `in`.hahow.android_recruit_project.model.courses.data.Data
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun Card(
    data: Data
) {

    val paddingSize: Dp = 8.dp

    Row() {
        ThumbnailWithState(
            modifier = Modifier,
            url = data.coverImageUrl,
            status = data.status,
            paddingSize = paddingSize
        )
        Title(
            modifier = Modifier,
            title = data.title,

        )
    }
}