package `in`.hahow.android_recruit_project.view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun MainScreen(
    viewModel: MainScreenViewModel = hiltViewModel()
) {

    LazyColumn() {
        items(viewModel.courses) { item ->
            Text(text = item.title)
        }
    }

}