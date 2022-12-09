package `in`.hahow.android_recruit_project.view

import `in`.hahow.android_recruit_project.R
import `in`.hahow.android_recruit_project.model.courses.data.Status
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun ThumbnailWithState(
    modifier: Modifier,
    url: String,
    status: Status
) {
    Box(
        modifier = modifier
    ) {
        Thumbnail(url)
        Text(
            modifier = Modifier
                .align(Alignment.BottomEnd),
            text = LocalContext.current.getString(
                when (status) {
                    Status.INCUBATING -> {R.string.INCUBATING}
                    Status.PUBLISHED -> {R.string.PUBLISHED}
                    Status.SUCCESS -> {R.string.SUCCESS}
                }
            )
        )
    }
}