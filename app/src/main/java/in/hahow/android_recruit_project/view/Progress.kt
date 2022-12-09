package `in`.hahow.android_recruit_project.view

import `in`.hahow.android_recruit_project.R
import `in`.hahow.android_recruit_project.model.courses.data.Data
import `in`.hahow.android_recruit_project.model.courses.data.Status
import `in`.hahow.android_recruit_project.view.util.color.StatusColor
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
    val numCriteria = data.successCriteria.numSoldTickets
    val numSoldTickets = data.numSoldTickets

    val text =
        if (numSoldTickets == 0) "100%"
        else {
            val nonReachCriteriaStr = "$numSoldTickets / $numCriteria ${localContext.getString(R.string.people)}"
            val reachCriteriaStr = "${localContext.getString(R.string.reach_criteria)} ${
                (numSoldTickets.toFloat() /
                        numCriteria * 100).toInt()
            }%"
            when (data.status) {
                Status.PUBLISHED -> {
                    if (numSoldTickets > numCriteria) "100%"
                    else nonReachCriteriaStr
                }
                else -> {
                    if (numSoldTickets < numCriteria) nonReachCriteriaStr
                    else reachCriteriaStr
                }
            }
        }

    val percentage = if (numSoldTickets > numCriteria) 1f
        else if (numSoldTickets == 0) 1f
        else numSoldTickets.toFloat() / numCriteria

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
            progress = percentage
        )
    }
}