package `in`.hahow.android_recruit_project.model.courses.impl

import `in`.hahow.android_recruit_project.model.courses.data.Courses
import `in`.hahow.android_recruit_project.model.courses.data.Data
import `in`.hahow.android_recruit_project.model.courses.repository.CoursesApiRepository
import `in`.hahow.android_recruit_project.model.json.JsonHelper
import android.content.Context
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class CoursesApiImpl(
    private val context: Context,
    private val jsonHelper: JsonHelper
): CoursesApiRepository {

    private val fileName = "data.json"
    private val type = Courses::class.java

    override suspend fun getCourses(): Flow<List<Data>> {
        return flow {
            emit((jsonHelper.get(context, fileName, type) as Courses).data)
        }
    }

}