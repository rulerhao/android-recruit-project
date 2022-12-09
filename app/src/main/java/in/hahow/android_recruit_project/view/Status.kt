package `in`.hahow.android_recruit_project.view

import `in`.hahow.android_recruit_project.R
import `in`.hahow.android_recruit_project.model.courses.data.Status
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun Status(
    modifier: Modifier,
    status: Status,
    cornerSize: Dp
) {
    Text(
        modifier = modifier
            .clip(RoundedCornerShape(topStart = 16.dp, bottomEnd = cornerSize))
            .background(Color.Green)
            .padding(horizontal = 8.dp, vertical = 4.dp),
        text = LocalContext.current.getString(
            when (status) {
                Status.INCUBATING -> {
                    R.string.INCUBATING}
                Status.PUBLISHED -> {
                    R.string.PUBLISHED}
                Status.SUCCESS -> {
                    R.string.SUCCESS}
            }
        )
    )
}