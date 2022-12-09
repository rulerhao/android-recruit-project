package `in`.hahow.android_recruit_project.model.courses.repository

import `in`.hahow.android_recruit_project.model.courses.data.Data
import kotlinx.coroutines.flow.Flow

interface CoursesApiRepository {

    suspend fun getCourses(): Flow<List<Data>>

}