package `in`.hahow.android_recruit_project.view

import `in`.hahow.android_recruit_project.model.courses.data.Data
import `in`.hahow.android_recruit_project.view.util.color.StatusColor
import `in`.hahow.android_recruit_project.view.util.progress.ProgressHelper
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

@Composable
fun Progress(
    modifier: Modifier,
    data: Data
) {

    val localContext = LocalContext.current

    val barPercentage = ProgressHelper.getBarPercentage(data)

    val text = ProgressHelper.getProgressString(localContext, data)

    val indicatorColor = StatusColor().getColor(status = data.status)

    Column(
        modifier = modifier
    ) {
        Text(
            text = text,
            color = Color.Gray
        )
        LinearProgressIndicator(
            modifier = Modifier
                .fillMaxWidth(0.3f),
            color = indicatorColor,
            progress = barPercentage
        )
    }
}