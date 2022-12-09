package `in`.hahow.android_recruit_project.view

import `in`.hahow.android_recruit_project.model.courses.data.Data
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Card(
    data: Data
) {
    Row() {
        ThumbnailWithState(
            modifier = Modifier,
            url = data.coverImageUrl,
            status = data.status
        )
        Title(
            modifier = Modifier,
            title = data.title,

        )
    }
}