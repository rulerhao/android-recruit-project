package `in`.hahow.android_recruit_project.model.courses.di

import `in`.hahow.android_recruit_project.model.courses.impl.CoursesApiImpl
import `in`.hahow.android_recruit_project.model.courses.repository.CoursesApiRepository
import `in`.hahow.android_recruit_project.model.courses.use_cases.CoursesApiUseCases
import `in`.hahow.android_recruit_project.model.courses.use_cases.GetCourses
import `in`.hahow.android_recruit_project.model.json.JsonHelper
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object CoursesApiModule {

    @ViewModelScoped
    @Provides
    fun providesJsonHelper() = JsonHelper()

    @ViewModelScoped
    @Provides
    fun provideRepository(@ApplicationContext appContext: Context, jsonHelper: JsonHelper): CoursesApiRepository {
        return CoursesApiImpl(appContext, jsonHelper)
    }

    @ViewModelScoped
    @Provides
    fun provideUseCases(repository: CoursesApiRepository): CoursesApiUseCases {
        return CoursesApiUseCases(
            getCourses = GetCourses(repository)
        )
    }
}