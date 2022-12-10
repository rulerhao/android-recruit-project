package `in`.hahow.android_recruit_project.view.util.time

import `in`.hahow.android_recruit_project.R
import android.content.Context
import java.text.SimpleDateFormat
import java.util.*

object TimeHelper {

    fun getCountDownText(context: Context, dueDate: String?): String {

        val format = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())

        var str = ""

        try {
            val date: Date? = if (dueDate == null || dueDate.isEmpty()) null
            else format.parse(dueDate)
            val currentDate = Calendar.getInstance().time

            if (date == null) return str

            val diff = date.time - currentDate.time
            val diffMinute = diff / (1000 * 60)
            val diffHour = diffMinute / 60
            val diffDay = diffHour / 24
            if (diffMinute > 0) str = context.getString(R.string.count_minute, diffMinute)
            if (diffHour > 0) str = context.getString(R.string.count_hour, diffHour)
            if (diffDay > 0) str = context.getString(R.string.count_day, diffDay)
        } catch(e: Exception) {
            e.printStackTrace()
        }

        return str

    }

    fun checkBeforeCurrent(dueDate: String?): Boolean {

        val format = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())

        try {
            val date: Date? = if (dueDate == null || dueDate.isEmpty()) null
                else format.parse(dueDate)
            val currentDate = Calendar.getInstance().time

            if (date == null) return false
            val diff = date.time - currentDate.time
            if (diff < 0) return true
        } catch(e: Exception) {
            e.printStackTrace()
        }

        return false
    }

}