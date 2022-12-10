package `in`.hahow.android_recruit_project.view

import `in`.hahow.android_recruit_project.R
import `in`.hahow.android_recruit_project.model.courses.data.Data
import `in`.hahow.android_recruit_project.model.courses.data.Status
import `in`.hahow.android_recruit_project.view.util.time.TimeHelper
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

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

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (text.isNotBlank()) {
            Image(
                modifier = Modifier.size(20.dp),
                painter = painterResource(id = R.drawable.timelapse),
                contentDescription = null
            )
        }
        Spacer(modifier = Modifier.size(4.dp))
        Text(
            color = Color.Gray,
            text = text
        )
    }
}