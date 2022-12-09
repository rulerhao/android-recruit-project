package `in`.hahow.android_recruit_project.view.util.progress

import `in`.hahow.android_recruit_project.R
import `in`.hahow.android_recruit_project.model.courses.data.Data
import `in`.hahow.android_recruit_project.model.courses.data.Status
import android.content.Context

object ProgressHelper {

    fun getProgressString(context: Context, data: Data): String {
        val numCriteria = data.successCriteria.numSoldTickets
        val numSoldTickets = data.numSoldTickets

        return if (numCriteria == 0) "100%"
            else {
                val nonReachCriteriaStr = "$numSoldTickets / $numCriteria ${context.getString(R.string.people)}"
                val reachCriteriaStr = "${context.getString(R.string.reach_criteria)} " +
                        "${(numSoldTickets.toFloat() / numCriteria * 100).toInt()}%"
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
    }

    fun getBarPercentage(data: Data): Float {
        val numCriteria = data.successCriteria.numSoldTickets
        val numSoldTickets = data.numSoldTickets

        return if (numSoldTickets > numCriteria) 1f
            else if (numCriteria == 0) 1f
            else numSoldTickets.toFloat() / numCriteria
    }

}