package `in`.hahow.android_recruit_project.view

import `in`.hahow.android_recruit_project.model.courses.data.Status
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun ThumbnailWithState(
    modifier: Modifier,
    url: String,
    status: Status,
    paddingSize: Dp
) {

    val cornerSize: Dp = 8.dp

    Box(
        modifier = modifier
            .padding(paddingSize)
    ) {
        Thumbnail(
            url = url,
            cornerSize = cornerSize
        )
        Status(
            modifier = Modifier
                .align(Alignment.BottomEnd),
            status = status,
            cornerSize = cornerSize
        )
    }
}