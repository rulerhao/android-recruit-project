package `in`.hahow.android_recruit_project.view.util.status

import `in`.hahow.android_recruit_project.R
import `in`.hahow.android_recruit_project.model.courses.data.Data
import `in`.hahow.android_recruit_project.model.courses.data.Status
import android.content.Context

object StatusHelper {

    fun getStatusString(context: Context, data: Data): String {
        return context.getString(
            when (data.status) {
                Status.INCUBATING -> {
                    if (data.successCriteria.numSoldTickets < data.numSoldTickets) R.string.SUCCESS
                    else R.string.INCUBATING
                }
                Status.PUBLISHED -> R.string.PUBLISHED
                Status.SUCCESS -> R.string.SUCCESS
            }
        )
    }

}