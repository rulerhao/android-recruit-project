package `in`.hahow.android_recruit_project

import `in`.hahow.android_recruit_project.model.courses.use_cases.CoursesApiUseCases
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject

@HiltAndroidTest
class CoursesApiTest (
) {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Inject
    lateinit var coursesApiUseCases: CoursesApiUseCases

    @Before
    fun setup() {
        hiltRule.inject()
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun testCoursesGet() = runTest {
        coursesApiUseCases.getCourses().collectLatest { courses ->
            val mockItems = CoursesApiMockItems().items
            assertEquals(mockItems, courses)
        }
    }

}