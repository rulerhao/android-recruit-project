package `in`.hahow.android_recruit_project.view.util.progress

import `in`.hahow.android_recruit_project.R
import `in`.hahow.android_recruit_project.model.courses.data.Data
import `in`.hahow.android_recruit_project.model.courses.data.Status
import android.content.Context

object ProgressHelper {

    fun getProgressString(context: Context, data: Data): String {
        val numCriteria = data.successCriteria.numSoldTickets
        val numSoldTickets = data.numSoldTickets

        if (numCriteria == 0) return "100%"
        if (numSoldTickets < numCriteria) return getNonReachCriteriaStr(context, numCriteria, numSoldTickets)
        if (data.status == Status.PUBLISHED) return "100%"
        return getReachCriteriaStr(context, numCriteria, numSoldTickets)
    }

    private fun getNonReachCriteriaStr(context: Context, numCriteria: Int, numSoldTickets: Int):
            String {
        return "$numSoldTickets / $numCriteria ${context.getString(R.string.people)}"
    }

    private fun getReachCriteriaStr(context: Context, numCriteria: Int, numSoldTickets: Int): String {
        return "${context.getString(R.string.reach_criteria)} " +
                "${(numSoldTickets.toFloat() / numCriteria * 100).toInt()}%"
    }

    fun getBarPercentage(data: Data): Float {
        val numCriteria = data.successCriteria.numSoldTickets
        val numSoldTickets = data.numSoldTickets

        return if (numSoldTickets > numCriteria) 1f
            else if (numCriteria == 0) 1f
            else numSoldTickets.toFloat() / numCriteria
    }

}