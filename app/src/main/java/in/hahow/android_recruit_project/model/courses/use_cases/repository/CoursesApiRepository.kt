package `in`.hahow.android_recruit_project.model.courses.use_cases.repository

import `in`.hahow.android_recruit_project.model.Courses

interface CoursesApiRepository {

    suspend fun getCourses(): Courses

}