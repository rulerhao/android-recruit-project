package `in`.hahow.android_recruit_project.model.courses.impl

import `in`.hahow.android_recruit_project.model.courses.data.Courses
import `in`.hahow.android_recruit_project.model.courses.repository.CoursesApiRepository
import `in`.hahow.android_recruit_project.model.json.JsonHelper
import android.content.Context

class CoursesApiImpl(
    private val context: Context
): CoursesApiRepository {

    private val fileName = "data.json"
    private val type = Courses::class.java

    override suspend fun getCourses(): Courses {
        return JsonHelper().get(context = context, fileName, type) as Courses
    }

}