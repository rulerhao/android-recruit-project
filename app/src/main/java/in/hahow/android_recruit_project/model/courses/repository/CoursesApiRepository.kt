package `in`.hahow.android_recruit_project.model.courses.repository

import `in`.hahow.android_recruit_project.model.courses.data.Courses

interface CoursesApiRepository {

    suspend fun getCourses(): Courses

}