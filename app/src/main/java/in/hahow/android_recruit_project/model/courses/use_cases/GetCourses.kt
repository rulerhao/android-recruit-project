package `in`.hahow.android_recruit_project.model.courses.use_cases

import `in`.hahow.android_recruit_project.model.courses.data.Data
import `in`.hahow.android_recruit_project.model.courses.data.Status
import `in`.hahow.android_recruit_project.model.courses.repository.CoursesApiRepository
import `in`.hahow.android_recruit_project.view.util.color.time.TimeHelper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetCourses(
    val repository: CoursesApiRepository
) {

    suspend operator fun invoke(): Flow<List<Data>> {
        // Parse the out of date courses.
        return repository.getCourses().map { courses ->
            val mutableCourses = courses.toMutableList()
            val deleteCourses = mutableListOf<Data>()

            mutableCourses.forEach { course ->
                val numCriteria = course.successCriteria.numSoldTickets
                val numSoldTickets = course.numSoldTickets
                if (TimeHelper.checkBeforeCurrent(course.proposalDueTime) &&
                    course.status == Status.INCUBATING &&
                    numCriteria > numSoldTickets
                ) {
                    deleteCourses.add(course)
                }
            }
            deleteCourses.forEach {
                mutableCourses.remove(it)
            }
            mutableCourses
        }
    }

}