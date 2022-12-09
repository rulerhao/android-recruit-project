package `in`.hahow.android_recruit_project.view

import `in`.hahow.android_recruit_project.model.courses.data.Data
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
fun Content(
    paddingSize: Dp,
    data: Data
) {
    Box(
        modifier = Modifier
            .padding(paddingSize)
            .fillMaxSize()
    ) {
        Title(
            modifier = Modifier
                .align(Alignment.TopStart),
            title = data.title
        )
        Progress(
            modifier = Modifier
                .align(Alignment.BottomStart),
            data = data
        )
        Deadline(
            modifier = Modifier
                .align(Alignment.BottomEnd),
            data = data
        )
    }
}