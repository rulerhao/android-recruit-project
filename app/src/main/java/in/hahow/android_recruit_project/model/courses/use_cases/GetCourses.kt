package `in`.hahow.android_recruit_project.model.courses.use_cases

import `in`.hahow.android_recruit_project.model.courses.repository.CoursesApiRepository
import kotlinx.coroutines.flow.Flow
import `in`.hahow.android_recruit_project.model.courses.data.Data

class GetCourses(
    val repository: CoursesApiRepository
) {

    suspend operator fun invoke(): Flow<List<Data>> {
        return repository.getCourses()
    }

}