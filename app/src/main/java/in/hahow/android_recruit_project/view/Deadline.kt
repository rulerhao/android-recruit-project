package `in`.hahow.android_recruit_project.view

import `in`.hahow.android_recruit_project.model.courses.data.Data
import `in`.hahow.android_recruit_project.model.courses.data.Status
import `in`.hahow.android_recruit_project.view.util.color.time.TimeHelper
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

@Composable
fun Deadline(
    modifier: Modifier,
    data: Data
) {

    val localContext = LocalContext.current

    val str = TimeHelper.getCountDownText(localContext, data.proposalDueTime) // Set TimeHelper
    // as static to let it don't have to init so many times.

    val text = when (data.status) {
        Status.PUBLISHED -> "" // If courses are published than always don't show it's count down
        // time.
        Status.INCUBATING -> str
        Status.SUCCESS -> str
    }

    Text(
        modifier = modifier,
        color = Color.Gray,
        text = text
    )
}