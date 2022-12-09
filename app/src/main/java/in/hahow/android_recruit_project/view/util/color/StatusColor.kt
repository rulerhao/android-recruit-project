package `in`.hahow.android_recruit_project.view.util.color

import `in`.hahow.android_recruit_project.model.courses.data.Status
import `in`.hahow.android_recruit_project.ui.theme.Incubating
import `in`.hahow.android_recruit_project.ui.theme.Published
import `in`.hahow.android_recruit_project.ui.theme.Success
import androidx.compose.ui.graphics.Color

class StatusColor {
    fun getColor(status: Status): Color {
        return when (status) {
            Status.INCUBATING -> Incubating
            Status.PUBLISHED -> Published
            Status.SUCCESS -> Success
        }
    }
}