package `in`.hahow.android_recruit_project.view

import `in`.hahow.android_recruit_project.model.courses.data.Data
import `in`.hahow.android_recruit_project.model.courses.use_cases.CoursesApiUseCases
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainScreenViewModel @Inject constructor(private val coursesApiUseCases: CoursesApiUseCases):
    ViewModel() {

    private val _courses = mutableStateListOf<Data>()
    val courses: List<Data> = _courses

    private var getCoursesJob: Job? = null

    init {
        viewModelScope.launch {
            getCourses()
        }
    }

    private suspend fun getCourses() {
        getCoursesJob?.cancel()
        getCoursesJob = coursesApiUseCases.getCourses()
            .catch { exception ->
                exception.printStackTrace()
            }
            .onEach { courses ->
                _courses.clear()
                _courses.addAll(courses)
            }.launchIn(viewModelScope)
    }
}